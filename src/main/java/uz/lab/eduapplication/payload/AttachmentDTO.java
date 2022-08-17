package uz.lab.eduapplication.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachmentDTO {
    private UUID id;
    private String name;
    private String type;
    private Long size;
}