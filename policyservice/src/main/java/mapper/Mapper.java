package mapper;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

import com.policyservice.dto.NomineeDto;
import com.policyservice.dto.PolicyDTO;
import com.policyservice.model.NomineeDetails;
import com.policyservice.model.Policy;
import com.policyservice.model.Quote;

public class Mapper {

	public Policy toEntity(Quote quote)
	{
		Policy newPolicy = new Policy();
		newPolicy.setQuoteID(quote.getQuoteId());
		newPolicy.setPremiumAmount(quote.getPremiumAmount());
        newPolicy.setSumInsured(quote.getSumInsured());
        newPolicy.setUserId(quote.getUserId());
        newPolicy.setCoverageType(quote.getCoverageType());
        newPolicy.setModel(quote.getModel());
        newPolicy.setShowroomPrice(quote.getShowroomPrice());
        newPolicy.setEngineCapacity(quote.getEngineCapacity());
        newPolicy.setChassisNumber(quote.getChassisNumber());
        newPolicy.setCoverageType(quote.getCoverageType());
        newPolicy.setYearOfManufacture(quote.getYearOfManufacture());
        newPolicy.setManufacturer(quote.getManufacturer());
        newPolicy.setVehicleNumber(quote.getRegistrationNumber());
        newPolicy.setPaymentStatus("PENDING");
        newPolicy.setPolicyStatus("UNDER_REVIEW");
        newPolicy.setCreatedAt(LocalDateTime.now());
        newPolicy.setUpdatedAt(LocalDateTime.now());
        newPolicy.setStartDate(LocalDate.now());
        newPolicy.setEndDate(LocalDate.now().plusDays(365));
        String policyNumber = String.valueOf(generateRandomPolicyNumber());
        newPolicy.setPolicyNumber("MOT" + policyNumber);
        
        return newPolicy;
	}
	public int generateRandomPolicyNumber()
    {
        Random random = new Random();
        return random.nextInt(1000,9999);
    }
	
	public NomineeDetails toEntityNominee(NomineeDto nominee )
	{
		NomineeDetails details = new NomineeDetails();
		details.setnAadharNumber(nominee.getnAadharNumber());
		details.setnAddress(nominee.getnAddress());
		details.setnDOB(nominee.getnDOB());
		details.setnFirstName(nominee.getnFirstName());
		details.setnLastName(nominee.getnLastName());
		details.setnRelation(nominee.getnRelation());
		
		return details;
	}
	
	public PolicyDTO toDTO(Policy policy)
	{
		PolicyDTO dto = new PolicyDTO();
		dto.setQuoteId(policy.getQuoteID().toString());
		dto.setPremiumAmount(policy.getPremiumAmount());
        dto.setSumInsured(policy.getSumInsured());
        dto.setUserId(policy.getUserId().toString());
        dto.setCoverageType(policy.getCoverageType());
        dto.setModel(policy.getModel());
        dto.setShowroomPrice(policy.getShowroomPrice());
        dto.setEngineCapacity(policy.getEngineCapacity());
        dto.setChassisNumber(policy.getChassisNumber());
        dto.setCoverageType(policy.getCoverageType());
        dto.setYearOfManufacture(policy.getYearOfManufacture());
        dto.setManufacturer(policy.getManufacturer());
        dto.setVehicleNumber(policy.getVehicleNumber());
        dto.setPaymentStatus(policy.getPaymentStatus());
        dto.setPolicyStatus(policy.getPolicyStatus());
        dto.setCreatedAt(policy.getCreatedAt());
        dto.setUpdatedAt(policy.getUpdatedAt());
        dto.setStartDate(policy.getStartDate());
        dto.setEndDate(policy.getEndDate());
        dto.setPolicyNumber(policy.getPolicyNumber());
        
        //nominee details
        dto.setnFirstName(policy.getNomineeDetails().getnFirstName());
        dto.setnLastName(policy.getNomineeDetails().getnLastName());
        dto.setnAadharNumber(policy.getNomineeDetails().getnAadharNumber());
        dto.setnDOB(policy.getNomineeDetails().getnDOB());
        dto.setnAddress(policy.getNomineeDetails().getnAddress());
        dto.setnRelation(policy.getNomineeDetails().getnRelation());
        
		return dto;
	}
	
}
