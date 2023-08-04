package com.project.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.entity.Register;
import com.project.user.service.RegisterService;

@CrossOrigin("*")
@RestController
@RequestMapping

public class RegisterController {
	
	@Autowired
	private RegisterService service;
	
	@PostMapping("/reg")
	public ResponseEntity<String> addDemo(@RequestBody Register Demo) {
		 service.addDemo(Demo);
		return ResponseEntity.ok("You Have Register successfully!");
	}
	
	@GetMapping("/alldemo")
	public List<Register> getAll(){
		return service.getAll();
	}

}
