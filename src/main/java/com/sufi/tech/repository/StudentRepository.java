package com.sufi.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sufi.tech.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
