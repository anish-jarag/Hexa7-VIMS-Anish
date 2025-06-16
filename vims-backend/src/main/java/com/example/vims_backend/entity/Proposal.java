package com.example.vims_backend.entity;

import java.time.LocalDate;

import com.example.vims_backend.entity.enums.ProposalStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proposal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int proposalId;
    private int userId;
    private int vehicleId;
    private ProposalStatus status;
    private LocalDate submissionDate;
    private double quoteAmount;
    private int approvedBy;
    
    public Proposal() {
    }

    public Proposal(int proposalId, int userId, int vehicleId, ProposalStatus status, LocalDate submissionDate,
            double quoteAmount, int approvedBy) {
        this.proposalId = proposalId;
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.status = status;
        this.submissionDate = submissionDate;
        this.quoteAmount = quoteAmount;
        this.approvedBy = approvedBy;
    }

    @Override
    public String toString() {
        return "Proposal [proposalId=" + proposalId + ", userId=" + userId + ", vehicleId=" + vehicleId + ", status="
            + status + ", submissionDate=" + submissionDate + ", quoteAmount=" + quoteAmount + ", approvedBy="
            + approvedBy + "]";
    }

    public int getProposalId() {
        return proposalId;
    }

    public void setProposalId(int proposalId) {
        this.proposalId = proposalId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public ProposalStatus getStatus() {
        return status;
    }

    public void setStatus(ProposalStatus status) {
        this.status = status;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public double getQuoteAmount() {
        return quoteAmount;
    }

    public void setQuoteAmount(double quoteAmount) {
        this.quoteAmount = quoteAmount;
    }

    public int getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(int approvedBy) {
        this.approvedBy = approvedBy;
    }

}
