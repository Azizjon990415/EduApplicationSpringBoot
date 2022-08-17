package uz.lab.eduapplication.service;

import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.AnswerDTO;

import java.util.List;
import java.util.UUID;

public interface AnswerService {
    ApiResponse<AnswerDTO> createAnswer(AnswerDTO AnswerDTO);
    ApiResponse<AnswerDTO> updateAnswer(AnswerDTO AnswerDTO);
    ApiResponse removeAnswer(UUID AnswerId);
    ApiResponse<List<AnswerDTO>> getAnswers();

}
