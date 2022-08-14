package uz.lab.eduapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lab.eduapplication.entity.Role;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}
