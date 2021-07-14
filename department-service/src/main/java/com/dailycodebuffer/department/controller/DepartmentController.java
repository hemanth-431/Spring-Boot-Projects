package com.dailycodebuffer.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;
	
	@PostMapping("/")
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
//		log.info("Inside SaveDepartment");
		
		Department department1 = departmentservice.saveDeoartment(department);
		return new ResponseEntity<>(department1,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Department>> getAllDepartments(){
		List<Department> department=departmentservice.findAllDepartments();
		return new ResponseEntity<>(department,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> findDepartmentById(@PathVariable("id") Long id) {
		
		Department employees=departmentservice.findDepartmentId(id);
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Department> updateDepartment(@RequestBody Department department){
		Department employee=departmentservice.updateDepartment(department);
		return new ResponseEntity<>(employee,HttpStatus.OK);
		
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> DeleteDepartment(@PathVariable("id") Long id) {
		
		departmentservice.deleteDepartment(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
