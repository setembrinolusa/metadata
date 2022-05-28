package io.metadata.registration.core.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import io.metadata.registration.core.domain.entities.RegistrationEntity;

@Service
public interface RegistrationUseCase {

	public List<RegistrationEntity> findAll();
	
	public List<RegistrationEntity> findAllByCourseId(Long id);

	public List<RegistrationEntity> findAllByStudentId(Long id);

	public RegistrationEntity save(RegistrationEntity obj, Long courseId, Long studentId);

	public RegistrationEntity findById(Long id);

	public RegistrationEntity update(RegistrationEntity obj);

	public void delete(Long id);
}
