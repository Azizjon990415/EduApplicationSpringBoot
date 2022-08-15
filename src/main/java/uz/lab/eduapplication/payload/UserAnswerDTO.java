package uz.lab.eduapplication.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.lab.eduapplication.entity.Answer;
import uz.lab.eduapplication.entity.Question;
import uz.lab.eduapplication.entity.UserProgress;

import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAnswerDTO {
    private AnswerDTO answer;
    private QuestionDTO question;
    private UserProgressDTO userProgress;
}
