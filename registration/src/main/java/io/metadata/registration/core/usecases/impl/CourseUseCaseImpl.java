package io.metadata.registration.core.usecases.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.metadata.registration.adapters.jpa.repositories.CourseRepository;
import io.metadata.registration.core.domain.entities.CourseEntity;
import io.metadata.registration.core.exceptions.ResourceNotFoundException;
import io.metadata.registration.core.usecases.CourseUseCase;
import io.metadata.registration.core.usecases.mappers.CourseUcMapper;

@Service
public class CourseUseCaseImpl implements CourseUseCase {

	@Autowired
	private CourseRepository repo;

	@Autowired
	private CourseUcMapper mapper;

	private static final Logger logger = LoggerFactory.getLogger(CourseUseCaseImpl.class);

	public List<CourseEntity> findAll() {
		logger.info("Get all Courses");
		return mapper.repoToModelList(repo.findAll());

	}

	public CourseEntity save(CourseEntity obj) {
		logger.info("Creating a Course");
		return mapper.repoToModel(repo.save(mapper.modelToRepo(obj)));
	}

	public CourseEntity findById(Long id) {
		logger.info("Get Course By Id" + id);
		return mapper.repoToModel(repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course", "id", id)));

	}
	
	public CourseEntity update(CourseEntity obj) {
		logger.info("Creating a Course");
		return mapper.repoToModel(repo.save(mapper.modelToRepo(obj)));
	}
	
	public void delete(Long id) {
		logger.info("Deleting a Course");
		repo.deleteById(id);
	}
	
	public List<CourseEntity> findAllWithoutStudents() {
		logger.info("Get all Courses without Students");
		return mapper.repoToModelList(repo.findAllWithoutStudents());
	}

}
