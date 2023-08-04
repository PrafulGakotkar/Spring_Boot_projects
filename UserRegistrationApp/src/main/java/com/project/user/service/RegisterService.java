package com.project.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.user.entity.Register;
import com.project.user.repository.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepository repo;
	
	public Register addDemo(Register Demo) {
		return repo.save(Demo);
	}
	
	public List<Register> getAll(){
		return repo.findAll();
		}
}
