package com.quizapp.repository;

import com.quizapp.model.Session;
import com.quizapp.model.SessionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    Optional<Session> findByCode(String code);
    
    long countByStatusAndQuizId(SessionStatus status, Long quizId);
}
