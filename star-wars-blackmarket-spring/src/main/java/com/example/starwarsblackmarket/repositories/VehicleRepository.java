package com.example.starwarsblackmarket.repositories;

import com.example.starwarsblackmarket.models.Vehicle;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}
