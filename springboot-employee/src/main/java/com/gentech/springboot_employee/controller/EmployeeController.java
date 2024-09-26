package com.gentech.springboot_employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gentech.springboot_employee.entity.Employee;
import com.gentech.springboot_employee.service.EmployeeService;

@RestController
@RequestMapping("/v1/api")

public class EmployeeController {
	
	private EmployeeService employeeService;

	private EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getOneEmployee(@PathVariable Long id) throws Exception
	{
		return employeeService.getParticularEmployee(id);
	}

	@PostMapping("/employee1")
	public  Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.createEmployee(employee);
	}
	
	@DeleteMapping("/employee2/{id}")
	public String DeleteSpecificemployee(@PathVariable Long id)
	{
		employeeService.deleteEmployee(id);
		return "The Department with id value "+id+" has deleted succesfully";
	}
	
	@PutMapping("/employee3/{id}")
	public  Employee updateSpecificEmployee(@PathVariable Long id, @RequestBody Employee employee)
	{
		employee.setId(id);
		return employeeService.updateEmployee(employee);
	}
}
