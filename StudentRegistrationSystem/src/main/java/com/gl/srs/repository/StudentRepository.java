package com.gl.srs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.srs.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
