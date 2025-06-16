package com.example.vims_backend.service;

import com.example.vims_backend.entity.Proposal;
import com.example.vims_backend.entity.enums.ProposalStatus;
import com.example.vims_backend.repo.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProposalService {

    @Autowired
    private ProposalRepository proposalRepository;

    // Submit new proposal
    public Proposal submitProposal(Proposal proposal) {
        proposal.setStatus(ProposalStatus.PROPOSAL_SUBMITTED);
        return proposalRepository.save(proposal);
    }

    // Get proposal by ID
    public Proposal getProposalById(int proposalId) {
        return proposalRepository.findById(proposalId).orElse(null);
    }

    // List all proposals by user
    public List<Proposal> getProposalsByUserId(int userId) {
        return proposalRepository.findByUserId(userId);
    }

    // Officer approves and generates quote
    public Proposal approveProposal(int proposalId, double quoteAmount, int officerId) {
        Proposal proposal = getProposalById(proposalId);
        if (proposal != null) {
            proposal.setStatus(ProposalStatus.QUOTE_GENERATED);
            proposal.setQuoteAmount(quoteAmount);
            proposal.setApprovedBy(officerId);
            proposalRepository.save(proposal);
        }
        return proposal;
    }

    // Update proposal status manually
    public Proposal updateStatus(int proposalId, ProposalStatus status) {
        Proposal proposal = getProposalById(proposalId);
        if (proposal != null) {
            proposal.setStatus(status);
            proposalRepository.save(proposal);
        }
        return proposal;
    }
}
