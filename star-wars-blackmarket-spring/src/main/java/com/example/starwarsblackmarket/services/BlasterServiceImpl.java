package com.example.starwarsblackmarket.services;

import com.example.starwarsblackmarket.models.Blaster;
import com.example.starwarsblackmarket.repositories.BlasterRepository;
import com.example.starwarsblackmarket.services.BlasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlasterServiceImpl implements BlasterService{

    @Autowired
    private BlasterRepository blasterRepository;

    @Override
    public Iterable<Blaster> listBlasters() {
        return blasterRepository.findAll();
    }
}
