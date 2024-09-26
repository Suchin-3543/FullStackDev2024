package com.gentech.springboot_employee.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.gentech.springboot_employee.entity.Employee;
import com.gentech.springboot_employee.repository.EmployeeRepository;
import com.gentech.springboot_employee.service.EmployeeService;

@Service
public  class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		super();
		this.employeeRepository=employeeRepository;
	}

	@Override
	public List<Employee> getEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getParticularEmployee(Long id) throws Exception {
	
			Optional<Employee> emp=employeeRepository.findById(id);
			if(emp.isPresent())
	        {
	        	return emp.get();
		
	        }
	        throw new Exception("The Employee id "+id+" has not available in the database table");
	        

			
		}

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		 return employeeRepository.save(employee);
	}
}