package uz.lab.eduapplication.service;

import uz.lab.eduapplication.payload.AnswerDTO;
import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.UserDTO;
import uz.lab.eduapplication.payload.UserProgressDTO;

import java.util.List;
import java.util.UUID;

public interface UserService {
    ApiResponse<UserDTO> createUser(UserDTO user);
    ApiResponse<UserDTO> updateUser(UserDTO user);
    ApiResponse removeUser(UUID userId);
    ApiResponse<List<UserDTO>> getUsers();
    ApiResponse solveQuestion(List<AnswerDTO> anwers, UUID questionId);
    ApiResponse addSubject(UUID subjectId);
    ApiResponse<List<UserProgressDTO>> getStatuses();
    ApiResponse<UserProgressDTO> getStatus(UUID subjectId);
}
