package com.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cruddemo.entity.Location;
import com.springboot.cruddemo.service.LocationService;

@RestController
@RequestMapping("/api")
public class LocationRestController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/location")
    public ResponseEntity<List<Location>> findAllLocation() {
        return new ResponseEntity<List<Location>>(locationService.findAllLocation(), HttpStatus.OK);
    }

    @GetMapping("/location/{locationId}")
    public ResponseEntity<Location> findDepartmentById(@PathVariable int locationId) throws EmployeeServiceException{
        Location theLocation = locationService.findLocationById(locationId);
        if (theLocation == null || theLocation.getId() <= 0) {
            throw new EmployeeServiceException("Location with id " + locationId + " does not exist");
        }
        return new ResponseEntity<Location>(theLocation, HttpStatus.OK);
    }
}
