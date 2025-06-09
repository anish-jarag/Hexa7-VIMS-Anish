package com.hexaware.vims.model;
import com.hexaware.vims.model.enums.PolicyStatus;

public class Policy {
    private int policyId;
    private int proposalId;
    private String policyNumber;
    private String startDate;
    private String endDate;
    private PolicyStatus status;
    private String documentUrl;

    public Policy() {}

    public Policy(int policyId, int proposalId, String policyNumber, String startDate,
                  String endDate, PolicyStatus status, String documentUrl) {
        this.policyId = policyId;
        this.proposalId = proposalId;
        this.policyNumber = policyNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.documentUrl = documentUrl;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId=" + policyId +
                ", proposalId=" + proposalId +
                ", policyNumber='" + policyNumber + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status=" + status +
                ", documentUrl='" + documentUrl + '\'' +
                '}';
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public int getProposalId() {
        return proposalId;
    }

    public void setProposalId(int proposalId) {
        this.proposalId = proposalId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public void setStatus(PolicyStatus status) {
        this.status = status;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    

}
