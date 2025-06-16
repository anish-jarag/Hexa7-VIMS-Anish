package com.example.vims_backend.entity;

import com.example.vims_backend.entity.enums.ClaimStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Claim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int claimId;
    private int policyId;
    private String claimDate;
    private String description;
    private ClaimStatus status;
    private String remarks;

    public Claim() {}

    public Claim(int claimId, int policyId, String claimDate, String description,
                 ClaimStatus status, String remarks) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.claimDate = claimDate;
        this.description = description;
        this.status = status;
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Claim [claimId=" + claimId + ", policyId=" + policyId + ", claimDate=" + claimDate + ", description="
                + description + ", status=" + status + ", remarks=" + remarks + "]";
    }

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClaimStatus getStatus() {
        return status;
    }

    public void setStatus(ClaimStatus status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    
}
