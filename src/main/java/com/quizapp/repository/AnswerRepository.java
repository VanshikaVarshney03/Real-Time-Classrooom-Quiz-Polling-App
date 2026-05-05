package com.quizapp.repository;

import com.quizapp.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    Optional<Answer> findByStudentIdAndQuestionId(Long studentId, Long questionId);
    
    List<Answer> findByQuestionId(Long questionId);
    
    @Query("SELECT COUNT(a) FROM Answer a WHERE a.question.id = ?1 AND a.selectedOption = ?2")
    long countAnswersByQuestionAndOption(Long questionId, Integer option);
    
    @Query("SELECT COUNT(a) FROM Answer a WHERE a.question.id = ?1 AND a.isCorrect = true")
    long countCorrectAnswers(Long questionId);
    
    @Query("SELECT a FROM Answer a WHERE a.question.quiz.id = ?1 AND a.student.session.id = ?2")
    List<Answer> findByQuizAndSession(Long quizId, Long sessionId);
}
