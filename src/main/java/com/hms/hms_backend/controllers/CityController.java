package com.hms.hms_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.hms_backend.Domain.City;
import com.hms.hms_backend.Services.CityService;


@RestController
@RequestMapping("/api/cities")
public class CityController {
    @Autowired
    private CityService _service;
    CityController(CityService service){_service = service;}

    @GetMapping(path = "/all")
    public List<City> GetAllCities(){
        return _service.GetAll();
    }

    @GetMapping(path = "/{cityId}}")
    public City GetAllCities(Long cityId){
        return _service.GetById(cityId);
    }
}
