package com.quizapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaderboardEntry {
    private Long studentId;
    private String name;
    private Integer correctAnswers;
    private Integer totalAnswered;
    private Double score;
    private Integer rank;
}
