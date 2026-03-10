package com.dhiraj.insurance_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Policy number is required")
    private String policyNumber;

    @NotBlank(message = "Policy holder name is required")
    private String policyHolderName;

    @NotBlank(message = "Policy type is required")
    private String policyType;

    @NotNull(message = "Premium amount is required")
    @Positive(message = "Premium must be greater than 0")
    private Double premiumAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(Double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
}