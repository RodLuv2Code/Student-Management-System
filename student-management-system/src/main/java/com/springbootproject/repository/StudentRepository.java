package com.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootproject.entity.Student;
// You DON'T HAVE TO CREATE A @REPOSITORY ANNOTATION BECAUSE BY DEFAULT BY ADDING STUDENTREPOSITORY AND JpaRepository already take care of it
public interface StudentRepository extends JpaRepository <Student, Long>{
	

}
