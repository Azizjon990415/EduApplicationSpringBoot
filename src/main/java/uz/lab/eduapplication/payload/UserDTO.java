package uz.lab.eduapplication.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.lab.eduapplication.entity.enums.RoleEnum;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String userName;
    private String password;
    private String fullName;
    private List<RoleEnum> roles;
}
