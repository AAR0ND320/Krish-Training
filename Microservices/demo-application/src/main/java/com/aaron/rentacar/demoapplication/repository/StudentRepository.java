package com.aaron.rentacar.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.aaron.rentacar.demoapplication.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
//	Student save(Student student);

}
