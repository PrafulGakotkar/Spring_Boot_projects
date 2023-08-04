package com.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.entity.Student;

public interface LoginRepository extends JpaRepository<Student, Long>{
	
	Student findByEmailAndPassword(String email, String password);



}
