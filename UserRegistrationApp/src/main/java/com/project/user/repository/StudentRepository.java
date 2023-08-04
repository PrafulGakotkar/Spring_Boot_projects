package com.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByEmail(String name);
	
}