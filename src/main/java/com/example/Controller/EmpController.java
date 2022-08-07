package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ServiceI;
import com.example.model.Employee;

@RestController
public class EmpController {
@Autowired
	private ServiceI servicei;

@PostMapping (value = "/addEmployee",consumes = "applition/json")
public ResponseEntity<Employee> addData(@RequestBody Employee employee) {
	Employee savaData = servicei.savaData(employee);
	
	return new ResponseEntity<>(savaData,HttpStatus.CREATED);
	
}
}
