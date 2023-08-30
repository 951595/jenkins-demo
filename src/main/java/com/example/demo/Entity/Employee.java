package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
	public int id ;
	public String name;
	public String desg;
	public String location;
	public int salary;
	public String company;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesg() {
		return desg;
	}
	public String getLocation() {
		return location;
	}
	public int getSalary() {
		return salary;
	}
	public String getCompany() {
		return company;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", location=" + location + ", salary="
				+ salary + ", company=" + company + "]";
	}
	
	
}

