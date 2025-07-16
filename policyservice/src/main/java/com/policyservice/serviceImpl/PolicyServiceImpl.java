package com.policyservice.serviceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.Gson;
import static com.fatboyindustrial.gsonjavatime.Converters.registerAll;

import com.google.gson.GsonBuilder;
import com.policyservice.dto.NomineeDto;
import com.policyservice.dto.PolicyDTO;
import com.policyservice.exception.PolicyException;
import com.policyservice.model.NomineeDetails;
import com.policyservice.model.Policy;
import com.policyservice.model.Quote;
import com.policyservice.repository.PolicyRepository;
import com.policyservice.service.PolicyService;

import mapper.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.logging.Logger;

@Service
public class PolicyServiceImpl implements PolicyService {

@Autowired
private ModelMapper modelMapper;

private KafkaTemplate kafkaTemplate ;
public PolicyServiceImpl(KafkaTemplate <String,String>kafkaTemplate)
{
    this.kafkaTemplate = kafkaTemplate;
}

        ObjectMapper mapper = new ObjectMapper();
        @Autowired
        private PolicyRepository policyRepository;

        Mapper mapperEntity = new Mapper();

        Gson gson = registerAll(new GsonBuilder()).create();

    @KafkaListener(topics = "quote-accepted", groupId = "policy-group")
        @Override
    public Policy createPolicy(String policy) throws PolicyException, JsonProcessingException {

            System.out.println(policy);
            mapper.registerModule(new JavaTimeModule());
            Quote quote = mapper.readValue(policy,Quote.class);
            Policy newPolicy = new Policy();
          //mapping the values to entity 
           newPolicy =mapperEntity.toEntity(quote);
           String stringPolicy = mapper.writeValueAsString(newPolicy);

           kafkaTemplate.send("email-notification", stringPolicy);
            Logger.getLogger(stringPolicy);
           return policyRepository.save(newPolicy);

    }
    
    
    
    @Override
    public Policy getPolicy(UUID policyId) throws PolicyException {
        Policy existingPolicy = policyRepository.findById(policyId)
                .orElseThrow(()-> new PolicyException("Policy not found"));
        return existingPolicy;
    }



	@Override
	public Policy UpdatePolicyDetails(NomineeDto nominee, String policyNumber) throws PolicyException {
		// TODO Auto-generated method stub
		NomineeDetails details =new NomineeDetails();
		details = mapperEntity.toEntityNominee(nominee);
		
		Policy existingpolicy = policyRepository.findByPolicyNumber(policyNumber);
		if(existingpolicy.equals(null))
			throw new PolicyException("Policy number is invalid");
		existingpolicy.setNomineeDetails(details);
		policyRepository.save(existingpolicy);
		//map to dto 
		PolicyDTO dto = mapperEntity.toDTO(existingpolicy);
		
		String nomineeString = gson.toJson(dto);
		kafkaTemplate.send("policy-update",nomineeString);
		return existingpolicy;
	}
}
