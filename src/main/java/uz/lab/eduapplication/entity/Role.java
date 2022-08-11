package uz.lab.eduapplication.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import uz.lab.eduapplication.entity.enums.RoleEnum;
import uz.lab.eduapplication.entity.template.AbsEntity;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Role extends AbsEntity {
    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    private RoleEnum name;

    public Role(RoleEnum role) {
        name=role;
    }

//    @Override
    public String getAuthority() {
        return name.name();
    }
}
