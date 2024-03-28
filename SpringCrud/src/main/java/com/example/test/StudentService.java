package com.example.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	 StudentRepository studentRepository;
	
	public List<Student> findAllStudent(){
		return studentRepository.findAll();
	}
		
    public Student findStudentById(Integer id, Student student) {
			return studentRepository.findById(id).get();
			
		}
	
    public Student saveStudent(Student student)
		{
			return studentRepository.save(student);
			}
		
	public Student updateStudent(Integer id,Student student) {
			
			Student s=(Student) studentRepository.findById(id).get();
			s.setName(student.getName());
			Student save=(Student)studentRepository.save(s);
			return save ;
			
			}
		
	public void deleteStudent(Integer id) {
			 studentRepository.deleteById(id);;
			
		}
}
		
	
	
	


