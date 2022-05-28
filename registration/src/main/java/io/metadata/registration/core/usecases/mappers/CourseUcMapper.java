package io.metadata.registration.core.usecases.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import io.metadata.registration.adapters.jpa.models.Course;
import io.metadata.registration.core.domain.entities.CourseEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class CourseUcMapper {

	
	public abstract List<CourseEntity> repoToModelList(List<Course> list);
	
	public abstract Course modelToRepo(CourseEntity obj);
	
	public abstract CourseEntity repoToModel(Course obj);

}
