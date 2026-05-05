package com.quizapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaderboardResponse {
    private String sessionCode;
    private Long sessionId;
    private int totalParticipants;
    private List<LeaderboardEntry> leaderboard;
}
