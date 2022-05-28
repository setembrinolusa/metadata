package io.metadata.registration.core.usecases.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import io.metadata.registration.adapters.jpa.models.Student;
import io.metadata.registration.core.domain.entities.StudentEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class StudentUcMapper {

	
	public abstract List<StudentEntity> repoToModelList(List<Student> list);
	
	public abstract Student modelToRepo(StudentEntity obj);
	
	public abstract StudentEntity repoToModel(Student obj);

}
