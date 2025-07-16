package com.policyservice.controller;

import com.policyservice.dto.NomineeDto;
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

	
	  @PutMapping("/update-policy") 
	  public Policy createPolicy(@RequestBody NomineeDto nominee, @RequestParam("policyNumber") String policyNumber)throws PolicyException  { 
	  return policyService.UpdatePolicyDetails(nominee,policyNumber); 
	  }
	 
    @GetMapping("/getPolicy")
    public Policy getPolicy(@RequestParam ("policyId")UUID policyId)throws PolicyException
    {
        return policyService.getPolicy(policyId);
    }

}
