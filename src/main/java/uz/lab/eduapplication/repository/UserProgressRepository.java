package uz.lab.eduapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lab.eduapplication.entity.Attachment;
import uz.lab.eduapplication.entity.UserProgress;

import java.util.UUID;

public interface UserProgressRepository extends JpaRepository<UserProgress, UUID> {
}
