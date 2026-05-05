package com.quizapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerStatsResponse {
    private Long questionId;
    private String questionText;
    private int totalResponses;
    private Map<Integer, Integer> answerCounts = new HashMap<>();
    private Map<String, Double> answerPercentages = new HashMap<>();
    private Integer correctAnswer;
    private Long correctCount;
}
