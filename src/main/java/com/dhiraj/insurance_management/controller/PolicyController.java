package com.dhiraj.insurance_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dhiraj.insurance_management.model.Policy;
import com.dhiraj.insurance_management.service.PolicyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    // Create Policy
    @PostMapping
    public Policy createPolicy(@Valid @RequestBody Policy policy) {
        return policyService.savePolicy(policy);
    }

    // Get All Policies
    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyService.getAllPolicies();
    }

    // Get Policy By ID
    @GetMapping("/{id}")
    public Policy getPolicyById(@PathVariable Long id) {
        return policyService.getPolicyById(id);
    }

    // Delete Policy
    @DeleteMapping("/{id}")
    public void deletePolicy(@PathVariable Long id) {
        policyService.deletePolicy(id);
    }

    // Update Policy
    @PutMapping("/{id}")
    public Policy updatePolicy(@PathVariable Long id, @Valid @RequestBody Policy policy) {
        return policyService.updatePolicy(id, policy);
    }
}