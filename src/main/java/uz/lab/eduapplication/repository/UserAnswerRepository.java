package uz.lab.eduapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lab.eduapplication.entity.Attachment;
import uz.lab.eduapplication.entity.UserAnswer;

import java.util.UUID;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, UUID> {
}
