package com.example.vims_backend.entity;

import java.time.LocalDate;

import com.example.vims_backend.entity.enums.PolicyStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policyId;
    private int proposalId;
    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private PolicyStatus status;
    private String documentUrl;

    public Policy() {}

    public Policy(int policyId, int proposalId, String policyNumber, LocalDate startDate,
                  LocalDate endDate, PolicyStatus status, String documentUrl) {
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate localDate) {
        this.startDate = localDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
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
