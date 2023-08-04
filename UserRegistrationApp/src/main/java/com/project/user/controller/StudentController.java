package com.project.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.entity.Student;
import com.project.user.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class StudentController{
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@PostMapping("/adds")
	public List<Student> addStudents(@RequestBody List<Student> students){
		return service.saveStudents(students);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable  Long id) {
		return service.getStudentById(id);
	}
	
//	@PutMapping("/update")
//	public Student updateStudent(@RequestBody Student student) {
//		return service.updateStudent(student);
//	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable  Long id) {
		service.deleteById(id);
		return "Student deleted "+id;
	}
	
}