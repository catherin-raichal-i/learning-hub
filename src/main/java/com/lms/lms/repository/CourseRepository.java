package com.lms.lms.repository;

import com.lms.lms.entity.Course;
import com.lms.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findByTeacher(User teacher);

    List<Course> findByStudentsContaining(User student);

}
