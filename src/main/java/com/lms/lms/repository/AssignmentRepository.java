package com.lms.lms.repository;

import com.lms.lms.entity.Assignment;
import com.lms.lms.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentRepository extends JpaRepository<Assignment, Long>  {

    List<Assignment> findByCourseIn(List<Course> courses);

}
