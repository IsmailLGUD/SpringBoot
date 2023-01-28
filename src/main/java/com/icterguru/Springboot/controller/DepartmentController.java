package com.icterguru.Springboot.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.icterguru.Springgboot.Service.DepartmentService;

import entity.Department;

@RestController
public class DepartmentController {

	//@Autowired
	private DepartmentService departmentService;

	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {

		return departmentService.saveDepartment(department);
		
		

	}
}