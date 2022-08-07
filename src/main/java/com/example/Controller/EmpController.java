package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ServiceI;
import com.example.model.Employee;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
public class EmpController {
@Autowired
	private ServiceI servicei;

@PostMapping (value = "/addEmployee",consumes = "applition/json")
public ResponseEntity<Employee> addData(@RequestBody Employee employee) {
	Employee savaData = servicei.savaData(employee);
	
	return new ResponseEntity<>(savaData,HttpStatus.CREATED);
	
}
@PostMapping (value= "/addmulti", consumes = "application/json",produces = "application/json")
public ResponseEntity<List<Employee>>  multiemp(@RequestBody List<Employee> emp){
	List<Employee> list = servicei.savamultiple(emp);
	
	
	return new ResponseEntity<>(list,HttpStatus.CREATED);
	
	
	
}



}
