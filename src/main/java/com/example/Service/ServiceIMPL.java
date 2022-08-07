package com.example.Service;

import java.util.List;
import java.util.Optional;

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
		List<Employee> list = empRepository.saveAll((List<Employee>) employees);
		return list;
	}

	@Override
	public Employee getempById(int id) {
		Optional<Employee> byId = empRepository.findById(id);
		return byId.get();
	}

	@Override
	public List<Employee> getAllemp() {
		List<Employee> all = empRepository.findAll();
		return all;
	}

}
