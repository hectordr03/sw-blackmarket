package com.example.starwarsblackmarket.services;

import com.example.starwarsblackmarket.models.Vehicle;
import com.example.starwarsblackmarket.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Iterable<Vehicle> listVehicles() {
        return vehicleRepository.findAll();
    }
}
