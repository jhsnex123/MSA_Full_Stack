package com.example.springrestedu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "friend")
@NoArgsConstructor
@AllArgsConstructor
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fname;
    private Integer fage;

    public Friend(String fname, Integer fage) {
        this.fname = fname;
        this.fage = fage;
    }
}
