package com.hms.hms_backend.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.hms_backend.Domain.City;
import com.hms.hms_backend.Repositories.CityRepo;

@Service
public class CityService {
    @Autowired
    private CityRepo _cityRepo;

    CityService(CityRepo repo){
        this._cityRepo = repo;
    } 
    
    public List<City> GetAll(){
        return _cityRepo.findAll();
    }

    public City GetById(Long cityId){
        return _cityRepo.findById(cityId).get();
    }
}