package uz.lab.eduapplication.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import uz.lab.eduapplication.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserProgress extends AbsEntity {
    @ManyToOne
    private Subject subject;
    @Column
    private Integer score;
    @Column
    private Integer total;
    @ManyToOne
    private User user;
}
