package io.metadata.registration.adapters.http.rest.v1.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.metadata.registration.adapters.jpa.models.Course;
import io.metadata.registration.adapters.jpa.models.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistrationRequest implements Serializable {

	private static final long serialVersionUID = 6599204680379166090L;

	@JsonProperty("course")
	private Course course;

	@JsonProperty("student")
    private Student student;

}
