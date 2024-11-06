package jpaexam1.entity;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class EntityTest3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length=6)      // nullable = false null은 못들어감
    private String myName;
    @Column(columnDefinition = "varchar(30) default '녹색'")
    private String favoriteColor;
    @Column(name="age", nullable = false)
    private int number1;
    @Column(name="score", precision = 6, scale = 2)
    private BigDecimal number2;
    @Lob
    private byte[] content1;               // byte는 바이너리 값을 다룬다 db에서 blob이라는 뜻으로 나옴
    @Lob
    private char[] content2;
    @Lob
    private String content3;
}
