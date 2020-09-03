package com.example.starwarsblackmarket.services;

import com.example.starwarsblackmarket.models.Lightsaber;
import com.example.starwarsblackmarket.repositories.LightsaberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

@Service
public class LightsaberServiceImpl implements LightsaberService{

    @Autowired
    private LightsaberRepository lightsaberRepository;

    @Override
    public Iterable<Lightsaber> listLightsabers() {
        return lightsaberRepository.findAll();
    }
}
