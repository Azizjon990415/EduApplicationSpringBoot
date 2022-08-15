package uz.lab.eduapplication.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO {
    private UUID id;
    private String name;
    private Boolean active;
}
