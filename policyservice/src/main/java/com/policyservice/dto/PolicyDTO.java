package com.policyservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class PolicyDTO {

    private UUID policyId;
    @NotNull(message = "user id is mandatory")
    private UUID userId;
    @NotNull(message = "Quote id is mandatory")
    private UUID quoteId;
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

    public UUID getPolicyId() {
        return policyId;
    }

    public void setPolicyId(UUID policyId) {
        this.policyId = policyId;
    }

    public @NotNull(message = "user id is mandatory") UUID getUserId() {
        return userId;
    }

    public void setUserId(@NotNull(message = "user id is mandatory") UUID userId) {
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
}
