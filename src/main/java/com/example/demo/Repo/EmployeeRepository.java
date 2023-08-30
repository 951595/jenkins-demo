package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	//Employee getEmployeeById(int id);

	//List<Employee> getEmployees();

}
