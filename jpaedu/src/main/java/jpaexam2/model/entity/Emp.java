package jpaexam2.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Emp {
    @Id
    private int empno;
    @Column(length = 14)
    private String ename;
    @Column(length = 30)
    private String job;
    private Integer mgr;  //null값도 포함
    private java.sql.Date  hiredate;
    private int sal;
    private Integer comm;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="deptno")     // emp테이블하고 dept 테이블은 조인해줘야 하는데 emp 컬럼중에 deptno가 있어서 구분해주는 조인컬럼 어노테이션을 적용해야함
    private Dept deptno; // 참조하는 테이블의 엔티티를 유형을 참고해야한다
}
