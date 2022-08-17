package uz.lab.eduapplication.service;

import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.UserProgressDTO;

import java.util.UUID;

public interface AdminService {
    ApiResponse<UserProgressDTO> checkUserProgress(UUID userId);
}
