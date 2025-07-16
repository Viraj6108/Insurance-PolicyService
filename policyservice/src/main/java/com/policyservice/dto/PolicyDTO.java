package com.policyservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PolicyDTO {

    private String policyId;
    @NotNull(message = "user id is mandatory")
    private String userId;
    @NotNull(message = "Quote id is mandatory")
    private String quoteId;
    @NotNull(message = "Vehicle number is mandatory")
    private String vehicleNumber;
    @NotNull(message = "Registration number is mandatory")
    private String registrationState;
    @NotNull(message = "manufacturer  is mandatory")
    private String manufacturer;
    @NotNull(message = "Model Required")
    private String model;
    @NotNull(message = "year of manufacture is required")
    private int yearOfManufacture;
    @NotNull(message = "engine number  is required")
    private String engineNumber;
    @NotNull(message = "Required engine number")
    private String chassisNumber;

    @NotBlank(message = "Engine CC is required")
    private int engineCapacity;
    @NotBlank(message = "Showroom price required")
    private double showroomPrice;

    @NotBlank(message = "Purchase date is required")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate purchaseDate;
    //    coverage
    private String coverageType;
    private double sumInsured;

    //    policy Details
    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private String policyStatus;

    //Premium
    private double premiumAmount;
    private String paymentStatus;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String nFirstName;
	private String nLastName;
	private String nDOB;
	private String nAddress;
	private String nAadharNumber;
	private String nRelation;
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public @NotNull(message = "user id is mandatory") String getUserId() {
        return userId;
    }

    public void setUserId(@NotNull(message = "user id is mandatory") String userId) {
        this.userId = userId;
    }

    public @NotNull(message = "Vehicle number is mandatory") String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(@NotNull(message = "Vehicle number is mandatory") String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public @NotNull(message = "Registration number is mandatory") String getRegistrationState() {
        return registrationState;
    }

    public void setRegistrationState(@NotNull(message = "Registration number is mandatory") String registrationState) {
        this.registrationState = registrationState;
    }

    public @NotNull(message = "manufacturer  is mandatory") String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(@NotNull(message = "manufacturer  is mandatory") String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public @NotNull(message = "Model Required") String getModel() {
        return model;
    }

    public void setModel(@NotNull(message = "Model Required") String model) {
        this.model = model;
    }

    @NotNull(message = "year of manufacture is required")
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(@NotNull(message = "year of manufacture is required") int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public @NotNull(message = "engine number  is required") String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(@NotNull(message = "engine number  is required") String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public @NotNull(message = "Required engine number") String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(@NotNull(message = "Required engine number") String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public double getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(double sumInsured) {
        this.sumInsured = sumInsured;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @NotBlank(message = "Engine CC is required")
    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(@NotBlank(message = "Engine CC is required") int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @NotBlank(message = "Showroom price required")
    public double getShowroomPrice() {
        return showroomPrice;
    }

    public void setShowroomPrice(@NotBlank(message = "Showroom price required") double showroomPrice) {
        this.showroomPrice = showroomPrice;
    }

    public @NotBlank(message = "Purchase date is required") LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(@NotBlank(message = "Purchase date is required") LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

	public String getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getnFirstName() {
		return nFirstName;
	}

	public void setnFirstName(String nFirstName) {
		this.nFirstName = nFirstName;
	}

	public String getnLastName() {
		return nLastName;
	}

	public void setnLastName(String nLastName) {
		this.nLastName = nLastName;
	}

	public String getnDOB() {
		return nDOB;
	}

	public void setnDOB(String nDOB) {
		this.nDOB = nDOB;
	}

	public String getnAddress() {
		return nAddress;
	}

	public void setnAddress(String nAddress) {
		this.nAddress = nAddress;
	}

	public String getnAadharNumber() {
		return nAadharNumber;
	}

	public void setnAadharNumber(String nAadharNumber) {
		this.nAadharNumber = nAadharNumber;
	}

	public String getnRelation() {
		return nRelation;
	}

	public void setnRelation(String nRelation) {
		this.nRelation = nRelation;
	}
    
    
}
