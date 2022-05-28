package io.metadata.registration.adapters.http.rest.v1.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import io.metadata.registration.adapters.http.rest.v1.models.StudentRequest;
import io.metadata.registration.adapters.http.rest.v1.models.StudentResponse;
import io.metadata.registration.core.domain.entities.StudentEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class StudentHttpMapper {

	public abstract StudentEntity responseToModel(StudentResponse obj);

	public abstract List<StudentEntity> responseToModelList(List<StudentResponse> list);

	public abstract StudentResponse modelToResponse(StudentEntity obj);

	public abstract List<StudentResponse> modelToResponseList(List<StudentEntity> list);
	
	public abstract StudentEntity requestTomodel(StudentRequest obj);
	
}