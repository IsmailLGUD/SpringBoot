package com.icterguru.Springgboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.DepartmentRepository;
import entity.Department;

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {

		return departmentRepository.save(department);
	}

}
