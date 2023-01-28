package com.icterguru.Springgboot.Service;

import org.springframework.stereotype.Service;

import entity.Department;

@Service
public interface DepartmentService {

	public Department saveDepartment(Department department);

}
