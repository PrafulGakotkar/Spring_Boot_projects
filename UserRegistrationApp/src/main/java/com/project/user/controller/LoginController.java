package com.project.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.entity.Student;
import com.project.user.repository.StudentRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    private StudentRepository repo;

    

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Student user) {
        Student existingUser = repo.findByEmail(user.getEmail());
        if (existingUser == null || !existingUser.getPassword().equals(user.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
        return ResponseEntity.ok("Login successful!");
    }
}
