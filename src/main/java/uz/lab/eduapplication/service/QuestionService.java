package uz.lab.eduapplication.service;

import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.QuestionDTO;

import java.util.List;
import java.util.UUID;

public interface QuestionService {
    ApiResponse<QuestionDTO> createQuestion(QuestionDTO QuestionDTO);
    ApiResponse<QuestionDTO> updateQuestion(QuestionDTO QuestionDTO);
    ApiResponse removeQuestion(UUID QuestionId);
    ApiResponse<List<QuestionDTO>> getQuestions();

}
