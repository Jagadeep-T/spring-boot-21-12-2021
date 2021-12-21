package com.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.cruddemo.dao.LocationDAO;
import com.springboot.cruddemo.entity.Location;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDAO locationDAO;

    @Override
    @Transactional
    public List<Location> findAllLocation() {
        return locationDAO.findAllLocation();
    }
    
    @Override
    @Transactional
    public Location findLocationById(int locationId){
        return locationDAO.findLocationById(locationId);
    }
}
