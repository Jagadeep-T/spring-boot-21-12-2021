package com.springboot.cruddemo.service;

import java.util.List;

import com.springboot.cruddemo.entity.Employee;
import com.springboot.cruddemo.entity.Location;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

	List<Location> findAllLocation();
}
