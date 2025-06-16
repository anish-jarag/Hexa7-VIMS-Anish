package com.example.vims_backend.repo;

import com.example.vims_backend.entity.Policy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Integer> {
    Policy findByProposalId(int proposalId);
    List<Policy> findAllByProposalIdIn(List<Integer> proposalIds);
    Policy findByPolicyNumber(String policyNumber);
}
