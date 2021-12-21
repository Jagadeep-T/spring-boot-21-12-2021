package com.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.cruddemo.dao.EmployeeDAO;
import com.springboot.cruddemo.dao.LocationDAO;
import com.springboot.cruddemo.entity.Employee;
import com.springboot.cruddemo.entity.Location;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;
    @Autowired
    private LocationDAO locationDAO;
   
    @Override
    @Transactional
    public List<Location> findAllLocation() {
        return locationDAO.findAllLocation();
    }
    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}
