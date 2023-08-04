package com.project.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.user.entity.Student;
import com.project.user.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public Student authenticateRegister(String email,String password) {
		
		Student a=loginRepository.findByEmailAndPassword(email, password);
			
		System.out.println(a);
		return a;
	}
}
