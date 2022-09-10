package uz.lab.eduapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lab.eduapplication.entity.Question;
import uz.lab.eduapplication.entity.Subject;

import java.util.UUID;

public interface QuestionRepository extends JpaRepository<Question, UUID> {
    Integer countAllBySubject(Subject subject);
}
