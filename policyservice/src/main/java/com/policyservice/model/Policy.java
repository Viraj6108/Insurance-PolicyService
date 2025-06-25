package com.policyservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID policyId;
    private UUID userId;
    private UUID quoteID;

    private String vehicleNumber;
    private String registrationState;

    //Vehicle details
    private String manufacturer;
    private String model;
    private int yearOfManufacture;
    private String engineNumber;
    private String chassisNumber;
    private int engineCapacity;
    private double showroomPrice;

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
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "nominee_details")
    private NomineeDetails nomineeDetails;

    public UUID getPolicyId() {
        return policyId;
    }

    public void setPolicyId(UUID policyNumber) {
        this.policyId = policyNumber;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getRegistrationState() {
        return registrationState;
    }

    public void setRegistrationState(String registrationState) {
        this.registrationState = registrationState;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
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

    public double setSumInsured(double sumInsured) {
        this.sumInsured = sumInsured;
        return sumInsured;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumbe) {
        this.policyNumber = policyNumbe;
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

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getShowroomPrice() {
        return showroomPrice;
    }

    public void setShowroomPrice(double showroomPrice) {
        this.showroomPrice = showroomPrice;
    }

    public UUID getQuoteID() {
        return quoteID;
    }

    public void setQuoteID(UUID quoteID) {
        this.quoteID = quoteID;
    }

	public NomineeDetails getNomineeDetails() {
		return nomineeDetails;
	}

	public void setNomineeDetails(NomineeDetails nomineeDetails) {
		this.nomineeDetails = nomineeDetails;
	}

    
}
