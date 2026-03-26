package com.lms.lms.repository;

import com.lms.lms.entity.Course;
import com.lms.lms.entity.StudyMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudyMaterialRepository extends JpaRepository<StudyMaterial,Long> {
    List<StudyMaterial> findByCourse(Course course);
}
