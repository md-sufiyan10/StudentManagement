package com.sufi.tech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sufi.tech.entity.Student;
import com.sufi.tech.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServices{

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public List<Student> getAllStudent() {
		List<Student> list = studentRepository.findAll();
		
		return list;
	}


}
