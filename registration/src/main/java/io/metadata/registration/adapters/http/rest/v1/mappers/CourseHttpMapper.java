package io.metadata.registration.adapters.http.rest.v1.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import io.metadata.registration.adapters.http.rest.v1.models.CourseRequest;
import io.metadata.registration.adapters.http.rest.v1.models.CourseResponse;
import io.metadata.registration.core.domain.entities.CourseEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class CourseHttpMapper {

	public abstract CourseEntity responseToModel(CourseResponse obj);

	public abstract List<CourseEntity> responseToModelList(List<CourseResponse> list);

	public abstract CourseResponse modelToResponse(CourseEntity obj);

	public abstract List<CourseResponse> modelToResponseList(List<CourseEntity> list);
	
	public abstract CourseEntity requestTomodel(CourseRequest obj);
	
}