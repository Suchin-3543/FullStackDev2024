package com.gentech.springboot_employee.service;

import java.util.List;


import com.gentech.springboot_employee.entity.Employee;

public interface  EmployeeService {
	
	List<Employee> getEmployee();
	Employee getParticularEmployee(Long id) throws Exception;
	Employee createEmployee(Employee employee);
	void deleteEmployee(Long id);
	Employee updateEmployee( Employee  employee);
	
	
	
}