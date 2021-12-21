package com.springboot.cruddemo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="Code")
	private String code;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="status")
	private String status;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "location",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JsonBackReference
    private List<Employee> employees;

    public Location() {

    }

    

   

    public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getCode() {
		return code;
	}





	public void setCode(String code) {
		this.code = code;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}





	@Override
	public String toString() {
		return "Department [id=" + id + ", code=" + code + ", name=" + name + ", status=" + status + ", employees="
				+ employees + "]";
	}





	public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void add(Employee theEmployee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }

        employees.add(theEmployee);

        theEmployee.setLocation(this);
    }
}
