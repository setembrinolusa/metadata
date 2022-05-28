package io.metadata.registration.adapters.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.metadata.registration.adapters.jpa.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	@Query("SELECT co FROM Course co LEFT OUTER JOIN Registration reg ON co.id = reg.course.id WHERE reg.id IS NULL")
    List<Course> findAllWithoutStudents();

}
