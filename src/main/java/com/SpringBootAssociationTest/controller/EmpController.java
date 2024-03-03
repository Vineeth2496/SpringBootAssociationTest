package com.SpringBootAssociationTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringBootAssociationTest.service.EmpService;

@Component
public class EmpController {
	
	private EmpService service;
	
	public EmpController(EmpService service) {
		this.service=service;
		System.out.println("EmpController#Object");
	}
	//@Autowired
	//private EmpService service;
	
	public void testSave() {
		service.saveEmp();
		System.out.println("FROM CONTROLLER");
	}
}
