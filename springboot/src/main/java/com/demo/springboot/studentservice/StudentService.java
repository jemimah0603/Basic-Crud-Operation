package com.demo.springboot.studentservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.studententity.Student;
import com.demo.springboot.studentrepository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	public String addStudent(Student student) {
		studentRepository.save(student);
		return "Student has added saved";
	}
	public Optional<Student> getStudenById(Long id) {
		return this.studentRepository.findById(id);
		}

	
	public String deleteStudent(Long id) {
		studentRepository.deleteById(id);
		return "Student has deleted";
	}
	
	public Student updateStudent(Student student) {
		Student present = studentRepository.findById(student.getId()).orElse(null);
		if(present != null) {
			present.setName(student.getName());
			present.setEmail(student.getEmail());
			return studentRepository .save(present);
		}
		else {
			return null;
		}
	}
		
		
	
	
}

	

		
	


