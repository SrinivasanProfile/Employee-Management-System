package com.firstProject.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstProject.springboot.model.Employee;
import com.firstProject.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) 
	{
		this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if(optional.isPresent())
		{
			employee=optional.get();
		}else
		{
			throw new RuntimeException("Employee Not Found");
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}
	
	

}
