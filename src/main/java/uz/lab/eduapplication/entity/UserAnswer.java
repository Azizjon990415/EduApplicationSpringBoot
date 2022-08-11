package uz.lab.eduapplication.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import uz.lab.eduapplication.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserAnswer extends AbsEntity {
    @ManyToOne
    private Answer answer;
    @ManyToOne
    private Question question;
    @ManyToOne
    private UserProgress userProgress;
}
