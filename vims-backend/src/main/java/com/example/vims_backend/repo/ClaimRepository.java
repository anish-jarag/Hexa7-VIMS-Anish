package com.example.vims_backend.repo;

import com.example.vims_backend.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {
}
