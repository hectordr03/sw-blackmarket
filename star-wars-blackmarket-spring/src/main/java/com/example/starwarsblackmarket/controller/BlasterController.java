package com.example.starwarsblackmarket.controller;

import com.example.starwarsblackmarket.models.Blaster;
import com.example.starwarsblackmarket.services.BlasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BlasterController {

    @Autowired
    private BlasterService blasterService;

    @GetMapping("/blasters")
    public Iterable<Blaster> listBlasters() {
        return blasterService.listBlasters();
    }
}
