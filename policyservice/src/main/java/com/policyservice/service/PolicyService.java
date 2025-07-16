package com.policyservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.policyservice.dto.NomineeDto;
import com.policyservice.dto.PolicyDTO;
import com.policyservice.exception.PolicyException;
import com.policyservice.model.Policy;

import java.util.UUID;

public interface PolicyService {

    public Policy createPolicy(String policy) throws PolicyException, JsonProcessingException;
    public Policy getPolicy(UUID policyId) throws PolicyException;
    public Policy UpdatePolicyDetails(NomineeDto nominee, String policyNumber)throws PolicyException;

}
