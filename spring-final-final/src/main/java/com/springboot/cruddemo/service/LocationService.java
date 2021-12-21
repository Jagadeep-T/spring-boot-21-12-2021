package com.springboot.cruddemo.service;

import java.util.List;

import com.springboot.cruddemo.entity.Location;

public interface LocationService {

    public List<Location> findAllLocation();

    public Location findLocationById(int locationId);
}
