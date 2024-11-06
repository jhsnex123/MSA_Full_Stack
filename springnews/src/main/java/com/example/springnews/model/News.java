package com.example.springnews.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String writer;
    @Column
    private String title;
    @Column
    private String content;
    @CreationTimestamp
    @Column(name = "writedate")
    private java.sql.Date writedate;
    private int cnt;

}
