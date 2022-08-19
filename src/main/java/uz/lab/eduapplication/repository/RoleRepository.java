package uz.lab.eduapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lab.eduapplication.entity.Role;
import uz.lab.eduapplication.entity.enums.RoleEnum;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    List<Role> getRolesByNameIn(Collection<RoleEnum> name);
}
