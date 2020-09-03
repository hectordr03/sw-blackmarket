package com.example.starwarsblackmarket.controller;

import com.example.starwarsblackmarket.models.Lightsaber;
import com.example.starwarsblackmarket.services.LightsaberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LightsaberController {

    @Autowired
    private LightsaberService lightsaberService;

    @GetMapping("/lightsabers")
    public Iterable<Lightsaber> listLightsabers() {
        return lightsaberService.listLightsabers();
    }
}
