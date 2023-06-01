package com.springbootproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// LET MAKE THIS SIMPLE JAVA CLASS A JPA ENTITY BY USING @Entity Annotation
@Entity
// @Table just to provide a table name
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//@Column to create each Column
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	// WHENEVER YOU CREATE A CONSTRUCTOR ALWAYS CREATE A DEFAULT ONE IN JPA ENTITY
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String email) {
		super();
		//Create it without the Id
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
