package uz.lab.eduapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.UserDTO;
import uz.lab.eduapplication.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ApiResponse<List<UserDTO>> getUsers(){
        return userService.getUsers();
    }

//    @RequestMapping(path = "api/user",method = RequestMethod.POST)
    @PostMapping
    public ApiResponse<UserDTO> createUser(@RequestBody UserDTO user){
        return userService.createUser(user);
    }

    @PutMapping
    public   ApiResponse<UserDTO> updateUser(@RequestBody UserDTO user){
        return userService.updateUser(user);
    }

    @DeleteMapping("{userId}")
    public ApiResponse removeUser(@PathVariable UUID userId){
        return userService.removeUser(userId);
    }
}
