package com.gl.srs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.srs.entity.Student;
import com.gl.srs.repository.StudentRepository;
import com.gl.srs.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> listAll() {

		return repository.findAll();
	}

	@Override
	public void save(Student student) {

		repository.save(student);
	}

	@Override
	public Student findById(int id) {

		return repository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {

		repository.deleteById(id);
	}

}
