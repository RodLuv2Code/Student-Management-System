package com.springbootproject.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springbootproject.entity.Student;
import com.springbootproject.repository.StudentRepository;
import com.springbootproject.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {


	private StudentRepository studentRepository;
	
	
	//Create a Constructor 
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
    @Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
        return studentRepository.save(student);
	}
	//Override Implement Method
    @Override
	public List<Student> getAllStudents() {
	// this is return the list of all students	
		return studentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}
	
	
}
