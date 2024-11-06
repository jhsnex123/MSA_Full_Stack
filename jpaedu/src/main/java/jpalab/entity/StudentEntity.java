package jpalab.entity;


import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    private String name;
    private int score;
}
