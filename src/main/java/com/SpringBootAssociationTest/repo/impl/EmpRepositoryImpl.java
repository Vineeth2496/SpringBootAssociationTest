package com.SpringBootAssociationTest.repo.impl;

import org.springframework.stereotype.Component;

import com.SpringBootAssociationTest.repo.EmpRepository;
@Component
public class EmpRepositoryImpl implements EmpRepository{
	public EmpRepositoryImpl() {
		System.out.println("EmpRepository#Obj");
	}
	@Override
	public void saveEmp() {
		System.out.println("FROM Database Logics.");
	}

}
