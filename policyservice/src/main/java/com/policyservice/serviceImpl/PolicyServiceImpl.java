package com.policyservice.serviceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.Gson;
import com.policyservice.dto.PolicyDTO;
import com.policyservice.exception.PolicyException;
import com.policyservice.model.Policy;
import com.policyservice.model.Quote;
import com.policyservice.repository.PolicyRepository;
import com.policyservice.service.PolicyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Random;
import java.util.UUID;

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


        @KafkaListener(topics = "quote-accepted", groupId = "policy-group")
        @Override
    public Policy createPolicy(String policy) throws PolicyException, JsonProcessingException {

            System.out.println(policy);
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            Quote quote = mapper.readValue(policy, Quote.class);
            Policy newPolicy = new Policy();
           newPolicy.setCreatedAt(LocalDateTime.now());
           //Once payment is done then change the status to SUCCESS
           //And Change the policy status to ACTIVE
           //Add scheduler and if user does not pay within 1 day of buying policy then
           //Set status to LAPSED -Policy is not active due to non-payment of premiums.
           newPolicy.setPaymentStatus("PENDING");
           newPolicy.setPolicyStatus("UNDER_REVIEW");
           String policyNumber = String.valueOf(generateRandomPolicyNumber());
           newPolicy.setPolicyNumber("MOT" + policyNumber);

           newPolicy.setStartDate(LocalDate.now());
           newPolicy.setEndDate(LocalDate.now().plusDays(365));
           //registerModule is used to serialize date and time

           newPolicy.setPremiumAmount(quote.getPremiumAmount());
           newPolicy.setSumInsured(quote.getSumInsured());
           newPolicy.setUserId(quote.getUserId());
           newPolicy.setCoverageType(quote.getCoverageType());
           newPolicy.setModel(quote.getModel());
           newPolicy.setPurchaseDate(quote.getPurchaseDate());
           newPolicy.setRegistrationNumber(quote.getRegistrationNumber());
           newPolicy.setShowroomPrice(quote.getShowroomPrice());
           newPolicy.setEngineCapacity(quote.getEngineCapacity());
           newPolicy.setUpdatedAt(LocalDateTime.now());
           String stringPolicy = mapper.writeValueAsString(newPolicy);

           kafkaTemplate.send("policy-created", stringPolicy);
           return policyRepository.save(newPolicy);

    }
    public int generateRandomPolicyNumber()
    {
        Random random = new Random();
        return random.nextInt(1000,9999);
    }
    @Override
    public Policy getPolicy(UUID policyId) throws PolicyException {
        Policy existingPolicy = policyRepository.findById(policyId)
                .orElseThrow(()-> new PolicyException("Policy not found"));
        return existingPolicy;
    }
}
