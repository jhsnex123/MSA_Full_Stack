package com.example.springjpaedu.repository;

import com.example.springjpaedu.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitorRepository extends JpaRepository<Visitor, Integer>{

	public List<Visitor> findByMemoContains(String keyword); //리포지터리에 기능에 맞게 이름도 잘 지어야함
	
}
