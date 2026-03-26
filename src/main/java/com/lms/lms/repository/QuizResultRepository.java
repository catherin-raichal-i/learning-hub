package com.lms.lms.repository;

import com.lms.lms.entity.QuizResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizResultRepository extends JpaRepository<QuizResult,Long> {
    List<QuizResult> findByStudentId(Long studentId);
//    List<QuizResult> findByQuiz(com.ots.system.entity.Quiz quiz);
    List<QuizResult>findByQuiz(com.lms.lms.entity.Quiz Quiz);

}
