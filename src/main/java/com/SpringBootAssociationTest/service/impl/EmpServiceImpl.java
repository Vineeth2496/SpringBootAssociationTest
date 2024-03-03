package com.SpringBootAssociationTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringBootAssociationTest.repo.EmpRepository;
import com.SpringBootAssociationTest.service.EmpService;
@Component
public class EmpServiceImpl implements EmpService {
	
	private EmpRepository repo;
		
	public EmpServiceImpl(EmpRepository repo) {
		this.repo=repo;
		System.out.println("EmpService#Object");
	}
	
	//@Autowired
	//private EmpRepository repo;
	@Override
	public void saveEmp() {
		repo.saveEmp();
		System.out.println("FROM SERVICE");
	}

}
