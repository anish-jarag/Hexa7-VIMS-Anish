package com.example.vims_backend.repo;

import com.example.vims_backend.entity.Proposal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProposalRepository extends JpaRepository<Proposal, Integer> {
	List<Proposal> findByUserId(int userId);
}
