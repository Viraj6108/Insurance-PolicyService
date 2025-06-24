package com.policyservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.policyservice.dto.PolicyDTO;
import com.policyservice.exception.PolicyException;
import com.policyservice.model.Policy;
import com.policyservice.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

//    @PostMapping("/newPolicy")
//    public Policy createPolicy(@RequestBody PolicyDTO policyDTO)throws PolicyException, JsonProcessingException
//    {
//        return policyService.createPolicy(policyDTO);
//    }

    @GetMapping("/getPolicy")
    public Policy getPolicy(@RequestParam ("policyId")UUID policyId)throws PolicyException
    {
        return policyService.getPolicy(policyId);
    }

}
