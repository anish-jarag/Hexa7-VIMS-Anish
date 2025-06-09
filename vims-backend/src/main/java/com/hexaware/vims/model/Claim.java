package com.hexaware.vims.model;

import com.hexaware.vims.model.enums.ClaimStatus;

public class Claim {
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
