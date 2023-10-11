package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DeptDAO;

@Service("xxx")
public class DeptServiceImpl {
	
	@Autowired
	DeptDAO dao;

	public DeptServiceImpl() {
		System.out.println("DeptServiceImpl 생성");
	}
	
	public List<String> list()
	{
		return dao.list();
	}

}
