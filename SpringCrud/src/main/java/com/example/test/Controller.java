package com.example.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Controller {
	
	@Autowired
	 StudentService studentService;
	
	@PostMapping("student")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
		
	}
	@GetMapping("/student/{id}")
	public Student findStudentBYId(@PathVariable ("id") Integer id, Student student)
	{
		return studentService.findStudentById(id,student);
		
	}
	
	@DeleteMapping("student/{id}")
	public void deleteStudent(@PathVariable("id") Integer id, Student student)
	{
		studentService.deleteStudent(id);
		}
	  
	@GetMapping("student")
	public List<Student>findAllStudents(){
		return studentService.findAllStudent();
		
	}
	@RequestMapping("student/{id}")
	public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
		return student;
		
	}

}
