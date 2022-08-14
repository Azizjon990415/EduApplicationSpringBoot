package uz.lab.eduapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lab.eduapplication.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
