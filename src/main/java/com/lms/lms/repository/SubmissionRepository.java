package com.lms.lms.repository;

import com.lms.lms.entity.Assignment;
import com.lms.lms.entity.Submission;
import com.lms.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubmissionRepository extends JpaRepository<Submission,Long> {
    List<Submission> findByStudent(User student);

    List<Submission> findByAssignmentIn(List<Assignment> assignments);

}
