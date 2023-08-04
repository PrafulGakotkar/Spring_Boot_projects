package com.project.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.user.entity.Student;
import com.project.user.repository.StudentRepository;

@Service
public class StudentService{
	
	@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	
	public List<Student> saveStudents(List<Student> students) {
		return repo.saveAll(students);
	}
	
	public List<Student> getAllStudents(){
		return repo.findAll();
		}
	
	public Student getStudentById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public String deleteById(Long id) {
		repo.deleteById(id);
		return "student deleted" + id;
	}
	
//	public Student updateStudent(Student student) {
//		Student existingStudent= repo.findById(student.getId()).orElse(null);
//		existingStudent.setName(student.getName());
//		existingStudent.setEmail(student.getEmail());
//		return repo.save(existingStudent);
//	}
	
}