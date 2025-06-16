package com.example.vims_backend.repo;

import com.example.vims_backend.entity.Payment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	List<Payment> findByProposalId(int proposalId);
}
