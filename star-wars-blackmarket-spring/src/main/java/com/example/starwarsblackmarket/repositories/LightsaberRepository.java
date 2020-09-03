package com.example.starwarsblackmarket.repositories;

import com.example.starwarsblackmarket.models.Lightsaber;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

public interface LightsaberRepository extends CrudRepository<Lightsaber, Long> {
}
