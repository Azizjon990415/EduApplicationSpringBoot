package uz.lab.eduapplication.service;

import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.UserDTO;

import java.util.List;

public interface UserService {
    ApiResponse<UserDTO> createUser(UserDTO user);
    ApiResponse<UserDTO> updateUser(UserDTO user);
    ApiResponse removeUser(Long userId);
    ApiResponse<List<UserDTO>> getUsers();
}
