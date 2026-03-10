package com.dhiraj.insurance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiraj.insurance_management.exception.PolicyNotFoundException;
import com.dhiraj.insurance_management.model.Policy;
import com.dhiraj.insurance_management.repository.PolicyRepository;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    // Save Policy
    public Policy savePolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    // Get All Policies
    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    // Get Policy By Id
    public Policy getPolicyById(Long id) {
        return policyRepository.findById(id)
                .orElseThrow(() -> new PolicyNotFoundException("Policy not found with id: " + id));
    }

    // Delete Policy
    public void deletePolicy(Long id) {
        Policy policy = policyRepository.findById(id)
                .orElseThrow(() -> new PolicyNotFoundException("Policy not found with id: " + id));

        policyRepository.delete(policy);
    }

    // Update Policy
    public Policy updatePolicy(Long id, Policy policyDetails) {

        Policy policy = policyRepository.findById(id)
                .orElseThrow(() -> new PolicyNotFoundException("Policy not found with id: " + id));

        policy.setPolicyNumber(policyDetails.getPolicyNumber());
        policy.setPolicyHolderName(policyDetails.getPolicyHolderName());
        policy.setPolicyType(policyDetails.getPolicyType());
        policy.setPremiumAmount(policyDetails.getPremiumAmount());

        return policyRepository.save(policy);
    }
}