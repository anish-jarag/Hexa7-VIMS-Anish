package com.example.vims_backend.service;

import com.example.vims_backend.entity.Vehicle;
import com.example.vims_backend.repo.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    // Add a vehicle
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    // Get all vehicles for a user
    public List<Vehicle> getVehiclesByUserId(int userId) {
        return vehicleRepository.findByUserId(userId);
    }

    // Get vehicle by ID
    public Vehicle getVehicleById(int id) {
        return vehicleRepository.findById(id).orElse(null);
    }
}
