package com.hms.hms_backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.hms_backend.Domain.City;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {
    
}