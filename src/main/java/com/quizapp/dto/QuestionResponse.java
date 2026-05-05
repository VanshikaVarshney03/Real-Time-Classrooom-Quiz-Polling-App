package com.quizapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionResponse {
    private Long id;
    private String text;
    private List<String> options;
    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer correctAnswer;
}
