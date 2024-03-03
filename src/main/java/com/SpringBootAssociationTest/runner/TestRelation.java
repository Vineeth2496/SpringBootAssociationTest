package com.SpringBootAssociationTest.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootAssociationTest.controller.EmpController;
@Component
public class TestRelation implements CommandLineRunner {
	
	@Autowired
	private EmpController controller;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		controller.testSave();

	}

}
