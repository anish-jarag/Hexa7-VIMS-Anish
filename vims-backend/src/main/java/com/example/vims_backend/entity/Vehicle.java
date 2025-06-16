package com.example.vims_backend.entity;

import com.example.vims_backend.entity.enums.VehicleType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;
    private int userId;
    private VehicleType type;
    private String make;
    private String model;
    private String registrationNumber;
    private int manufactureYear;

    public Vehicle() {}

    public Vehicle(int vehicleId, int userId, VehicleType type, String make, String model,
                   String registrationNumber, int manufactureYear) {
        this.vehicleId = vehicleId;
        this.userId = userId;
        this.type = type;
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", userId=" + userId +
                ", type=" + type +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }

    public int getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public VehicleType getType() {
        return type;
    }
    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }
    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

}
