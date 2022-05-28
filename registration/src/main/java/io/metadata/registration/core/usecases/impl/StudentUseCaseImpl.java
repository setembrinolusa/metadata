package io.metadata.registration.core.usecases.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.metadata.registration.adapters.jpa.repositories.StudentRepository;
import io.metadata.registration.core.domain.entities.StudentEntity;
import io.metadata.registration.core.exceptions.ResourceNotFoundException;
import io.metadata.registration.core.usecases.StudentUseCase;
import io.metadata.registration.core.usecases.mappers.StudentUcMapper;

@Service
public class StudentUseCaseImpl implements StudentUseCase {
	
	@Autowired
	private StudentRepository repo;

	@Autowired
	private StudentUcMapper mapper;

	private static final Logger logger = LoggerFactory.getLogger(StudentUseCaseImpl.class);

	public List<StudentEntity> findAll() {
		logger.info("Get all Students");
		return mapper.repoToModelList(repo.findAll());

	}

	public StudentEntity save(StudentEntity obj) {
		logger.info("Creating a Student");
		return mapper.repoToModel(repo.save(mapper.modelToRepo(obj)));
	}

	public StudentEntity findById(Long id) {
		logger.info("Get Student By Id" + id);
		return mapper.repoToModel(repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "id", id)));
	}
	
	public StudentEntity update(StudentEntity obj) {
		logger.info("Creating a Student");
		return mapper.repoToModel(repo.save(mapper.modelToRepo(obj)));
	}
	
	public void delete(Long id) {
		logger.info("Creating a Student");
		repo.deleteById(id);
	}
	
	public List<StudentEntity> findAllWithoutCourses() {
		logger.info("Get all Students without Courses");
		return mapper.repoToModelList(repo.findAllWithoutCourses());
	}
}
