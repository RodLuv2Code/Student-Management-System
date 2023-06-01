package com.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootproject.entity.Student;
import com.springbootproject.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1 = new Student("Rod", "Boyer", "rodBoyer@gmail.com");
		*studentRepository.save(student1);
		
		*Student student2 = new Student("Ryan", "Aiden", "ryan@gmail.com");
		*studentRepository.save(student2);
		
		*Student student3 = new Student("Jeremiah", "Seven", "jere@gmail.com");
		*studentRepository.save(student3);
		*/
		
		
	}
	
}
