package jpaexam1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name="entitytesttbl")  //테이블 이름을 변경할 수 있는 어노테이션
public class EntityTest1 {
	@Id // 프라이머리키 값 설정 어노테이션
	@GeneratedValue(strategy = GenerationType.IDENTITY)    // @GeneratedValue 어노테이션을 써서 auto_increment가  id에 설정됨
	private int id;
	private String name;
	private int age;
	private LocalDateTime  birthday;
}
