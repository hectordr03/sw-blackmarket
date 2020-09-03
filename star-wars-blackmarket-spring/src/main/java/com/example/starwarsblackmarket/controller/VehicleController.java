package com.example.starwarsblackmarket.controller;

import com.example.starwarsblackmarket.models.Vehicle;
import com.example.starwarsblackmarket.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class VehicleController {
    
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicles")
    public Iterable<Vehicle> listVehicles() {
        return vehicleService.listVehicles();
    }
}
