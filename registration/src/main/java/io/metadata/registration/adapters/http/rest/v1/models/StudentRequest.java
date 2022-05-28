package io.metadata.registration.adapters.http.rest.v1.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class StudentRequest implements Serializable {

	private static final long serialVersionUID = 427064741293781658L;
	
	@JsonProperty("name")
    private String name;

}
