package com.policyservice.repository;

import com.policyservice.exception.PolicyException;
import com.policyservice.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, UUID> {

    public Policy findByVehicleNumber(String vehicleNumber) throws PolicyException;
}
