package uz.lab.eduapplication.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.UserDTO;

import java.util.ArrayList;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserServiceIT {
    @Autowired
    UserService userService;

    @BeforeAll
    public void init() {
    }

    @Test
    void testUserCreateUser(){
        UserDTO userDTO=new UserDTO();
        userDTO.setUserName("Shirina");
        userDTO.setFullName("Shirina Azizova");
        userDTO.setPassword("root123");
        userDTO.setRoles(new ArrayList<>());
        ApiResponse<UserDTO> user = userService.createUser(userDTO);
        assert user.getResult().getId()!=null;
    }



    @AfterAll
    public void end() {
    }
}
