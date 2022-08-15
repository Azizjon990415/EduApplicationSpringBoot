package uz.lab.eduapplication.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProgressDTO {
    private UUID id;
    private SubjectDTO subject;
    private Integer score;
    private Integer total;
    private UserDTO user;
}
