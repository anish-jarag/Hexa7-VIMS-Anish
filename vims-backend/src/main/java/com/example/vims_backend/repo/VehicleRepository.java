package com.example.vims_backend.repo;

import com.example.vims_backend.entity.Vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	List<Vehicle> findByUserId(int userId);
}
