package uz.lab.eduapplication.entity;

import lombok.*;
import org.hibernate.Hibernate;
import uz.lab.eduapplication.entity.template.AbsEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User extends AbsEntity {

    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String fullName;

    @ManyToMany
    private List<Role> roles;

    @OneToMany(mappedBy = "user")
    private List<UserProgress> userProgresses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return getId() != null && Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
