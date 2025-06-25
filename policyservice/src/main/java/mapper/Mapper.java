package mapper;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

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
}
