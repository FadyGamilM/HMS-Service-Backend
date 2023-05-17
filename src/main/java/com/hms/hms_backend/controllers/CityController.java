package com.hms.hms_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.hms_backend.Domain.City;
import com.hms.hms_backend.Services.CityService;


@RestController
@RequestMapping("/api/cities/")
public class CityController {
    @Autowired
    private CityService _service;
    CityController(CityService service){_service = service;}

    @GetMapping("/all")
    public List<City> GetAllCities(){
        return _service.GetAll();
    }

    @GetMapping("/{cityId:\\d+}")
    public City GetAllCities(@PathVariable("cityId") Long cityId){
        return _service.GetById(cityId);
    }

    @GetMapping("/{cityName:[a-zA-Z]+}")
    public City GetCityByName(@PathVariable("cityName") String cityName){
         return _service.GetByName(cityName);
    }

    @PostMapping("/new")
    public City CreateNewCity(@RequestBody City newCity ){
        return _service.Create(newCity);
    }
}
