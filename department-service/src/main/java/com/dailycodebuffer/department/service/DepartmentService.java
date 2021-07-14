package com.dailycodebuffer.department.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentrepository;

	public Department saveDeoartment(Department department) {
		department.setDepartmentId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
		return departmentrepository.save(department);
	}

	@RequestMapping
	public Department findDepartmentId(Long id) {
		// TODO Auto-generated method stub
		return departmentrepository.findByDepartmentId(id);
	}

	public List<Department> findAllDepartments() {
	   
		return departmentrepository.findAll();
	}

	public Department updateDepartment(Department department) {
		
		return departmentrepository.save(department);
	}

	public void deleteDepartment(Long id) {
		// TODO Auto-generated method stub
		Department dep=departmentrepository.getOne(id);
		departmentrepository.delete(dep);
	}
}
