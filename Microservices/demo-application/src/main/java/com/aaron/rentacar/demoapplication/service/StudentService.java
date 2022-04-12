package com.aaron.rentacar.demoapplication.service;

import com.aaron.rentacar.demoapplication.model.Student;

public interface StudentService {

	Student save(Student student);
	
	Student fetchStudentById(int id);
	
}
