package com.example.Service;

import java.util.List;

import com.example.model.Employee;

public interface ServiceI {

	public Employee savaData(Employee employee);
	
	public List<Employee> savamultiple(List<Employee> employees);
	
	public Employee getempById(int id);
	
	public List<Employee> getAllemp();
}
