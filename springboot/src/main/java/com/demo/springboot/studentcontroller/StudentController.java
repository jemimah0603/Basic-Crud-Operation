package com.demo.springboot.studentcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.studententity.Student;
import com.demo.springboot.studentservice.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/student")
	public List<Student> getAllStudent() {
		List<Student> studentList = studentService.getAllStudent();
		return studentList;

	}

	@GetMapping("/student/{id}")
	public Optional<Student> getStudentById(@PathVariable("id") Long id) {
		Optional<Student> student1 =  this.studentService.getStudenById(id);
		return student1;

	}
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable ("id") Long id) {
		return "The id has deleted";
	}

	@PostMapping("/post")
	public String registerNewStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return "The student has been created";
	}

	@PutMapping("/update")
	public String edit(@RequestBody Student student) {
		 studentService.addStudent(student);
		 return "The student has been updated";
		
	}

	

}
