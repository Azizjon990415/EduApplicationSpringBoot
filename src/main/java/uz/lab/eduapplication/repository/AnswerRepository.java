package uz.lab.eduapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lab.eduapplication.entity.Answer;
import uz.lab.eduapplication.entity.Attachment;
import uz.lab.eduapplication.entity.Question;

import java.util.List;
import java.util.UUID;

public interface AnswerRepository extends JpaRepository<Answer, UUID> {
    List<Answer> findAllByQuestion(Question question);
}
