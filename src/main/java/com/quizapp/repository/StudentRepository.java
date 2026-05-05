package com.quizapp.repository;

import com.quizapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentId(String studentId);
    
    List<Student> findBySessionIdOrderByCorrectAnswersDesc(Long sessionId);
    
    long countBySessionId(Long sessionId);
}
