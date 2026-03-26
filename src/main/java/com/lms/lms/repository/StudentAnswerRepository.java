package com.lms.lms.repository;

import com.lms.lms.entity.Question;
import com.lms.lms.entity.StudentAnswer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StudentAnswerRepository extends JpaRepository<StudentAnswer,Long> {
    @Modifying
    @Transactional
    @Query("DELETE FROM StudentAnswer sa WHERE sa.question = :question")
    void deleteByQuestion(Question question);
}
