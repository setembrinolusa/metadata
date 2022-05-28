package io.metadata.registration.core.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import io.metadata.registration.core.domain.entities.StudentEntity;

@Service
public interface StudentUseCase {

	public List<StudentEntity> findAll();

	public StudentEntity save(StudentEntity obj);

	public StudentEntity findById(Long id);
	
	public StudentEntity update(StudentEntity obj);

	public void delete(Long id);
	
	public List<StudentEntity> findAllWithoutCourses();
}
