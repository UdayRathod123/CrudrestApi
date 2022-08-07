package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepository;
import com.example.model.Employee;

@Service
public class ServiceIMPL implements ServiceI{

	@Autowired
	private EmployeeRepository empRepository;
	@Override
	
	public Employee savaData(Employee employee) {
		Employee save = empRepository.save(employee);
		return save;
	}

	@Override
	public List<Employee> savamultiple(List<Employee> employees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getempById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllemp() {
		// TODO Auto-generated method stub
		return null;
	}

}
