package uz.lab.eduapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.lab.eduapplication.entity.User;
import uz.lab.eduapplication.payload.AnswerDTO;
import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.UserDTO;
import uz.lab.eduapplication.payload.UserProgressDTO;
import uz.lab.eduapplication.repository.RoleRepository;
import uz.lab.eduapplication.repository.UserRepository;
import uz.lab.eduapplication.service.UserService;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public ApiResponse<UserDTO> createUser(UserDTO user) {
        User userEntity=new User();
        userEntity.setUserName(user.getUserName());
        userEntity.setPassword(user.getPassword());
        userEntity.setFullName(user.getFullName());
        userEntity.setRoles(roleRepository.getRolesByNameIn(user.getRoles()));
        userEntity=userRepository.save(userEntity);
        user.setId(userEntity.getId());
        return new ApiResponse<>(true,"Saved new User",user);
    }

    @Override
    public ApiResponse<UserDTO> updateUser(UserDTO user) {
        User userEntity=userRepository.findById(user.getId()).orElseThrow(() -> new EntityNotFoundException("User not found with id "+user.getId()));
        userEntity.setUserName(user.getUserName());
        userEntity.setPassword(user.getPassword());
        userEntity.setFullName(user.getFullName());
        userEntity.setRoles(roleRepository.getRolesByNameIn(user.getRoles()));
        userRepository.save(userEntity);
        return new ApiResponse<>(true,"Saved new User",user);
    }

    @Override
    public ApiResponse removeUser(UUID userId) {
        userRepository.deleteById(userId);
        return new ApiResponse(true,"User deleted",null);
    }

    @Override
    public ApiResponse<List<UserDTO>> getUsers() {
        List<UserDTO> userDTOS=new ArrayList<>();
        userRepository.findAll().forEach(user -> {
            UserDTO userDTO=new UserDTO();
            userDTO.setUserName(user.getUserName());
            userDTO.setFullName(user.getFullName());
            userDTO.setRoles(user.getRoles().stream().map(role -> role.getName()).collect(Collectors.toList()));
            userDTOS.add(userDTO);
                });
        return new ApiResponse<>(true,"users",userDTOS);
    }

    @Override
    public ApiResponse solveQuestion(List<AnswerDTO> anwers, UUID questionId) {

        return null;
    }

    @Override
    public ApiResponse addSubject(UUID subjectId) {
        return null;
    }

    @Override
    public ApiResponse<List<UserProgressDTO>> getStatuses() {
        return null;
    }

    @Override
    public ApiResponse<UserProgressDTO> getStatus(UUID subjectId) {
        return null;
    }
}
