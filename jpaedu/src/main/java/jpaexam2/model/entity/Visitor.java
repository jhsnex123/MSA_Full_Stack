package jpaexam2.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Getter
@Setter
@ToString
@Entity
public class Visitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@CreationTimestamp       //어노테이션은 엔티티가 생성될 때 해당 필드에 자동으로 생성 시간을 기록합니다. 즉, 새로운 엔티티 객체가 데이터베이스에 저장될 때, 해당 필드에 현재 시간이 자동으로 저장됩니다.
	private java.sql.Date writeDate;
	private String memo;
}
