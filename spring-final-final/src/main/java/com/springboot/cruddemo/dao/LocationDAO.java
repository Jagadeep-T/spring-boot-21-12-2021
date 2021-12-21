package com.springboot.cruddemo.dao;

import java.util.List;

import com.springboot.cruddemo.entity.Location;

public interface LocationDAO {

    public List<Location> findAllLocation();

    public Location findLocationById(int locationId);

    public void save(Location theLocation);

    public void deleteById(int theId);



}
