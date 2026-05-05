package com.quizapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SessionResponse {
    private Long id;
    private String code;
    private String status;
    private Long quizId;
    private LocalDateTime createdAt;
    private LocalDateTime endedAt;
    private Integer currentQuestionIndex;
    private long participantCount;
    private List<QuestionResponse> questions;
}
