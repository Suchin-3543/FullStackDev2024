package com.gentech.springboot_employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.springboot_employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findById(Long id);
		
	}


