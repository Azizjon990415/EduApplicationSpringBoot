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
public class Question extends AbsEntity {
    @Column
    private String text;

    @ManyToOne
    private Subject subject;

    @ManyToOne
    private Attachment attachment;

}
