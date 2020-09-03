package com.example.starwarsblackmarket.repositories;

import com.example.starwarsblackmarket.models.Blaster;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface BlasterRepository extends CrudRepository<Blaster, Long> {
}
