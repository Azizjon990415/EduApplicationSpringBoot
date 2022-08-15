package uz.lab.eduapplication.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {
    private UUID id;
    private String text;
    private SubjectDTO subject;
    private AttachmentDTO attachment;
}
