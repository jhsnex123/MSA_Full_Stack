package jpalab.controller;

import jpaexam2.model.entity.Visitor;
import jpalab.dao.StudentDAO;
import jpalab.entity.StudentEntity;

import java.util.List;

public class StudentController {
    private StudentDAO dao;

    public StudentController() {
        dao = new StudentDAO();
    }

    public void printAll() {
        List<StudentEntity> list = dao.getAllStudent();
        for (StudentEntity entity : list) {
            System.out.println(entity.getName() + "\t");
            System.out.println(entity.getScore() + "\t");
        }
    }

    public void printScore(String name)  {
        StudentEntity entity = dao.getScore(name);
        System.out.println(entity);

        if(entity == null){
            System.out.println(entity.getName()+"학생은 존재하지 않습니다.");
        }else{
            System.out.println(entity.getName()+"학생의 점수는"+entity.getScore()+"입니다.");
        }
/*        boolean result = false;
        if (entity != null) {
            result = true;
            System.out.print(entity.getName() + "학생은 존재하지 않습니다.");
            else{
                System.out.println(entity.getName() + "학생의 점수는" + entity.getScore() + "입니다");
            }
        }
        return result;*/
    }

    public void insert(String name, int score) {
        StudentEntity entity = new StudentEntity();
        entity.setName(name);
        entity.setScore(score);
        System.out.println(entity);
        boolean result = dao.insertStudent(entity);
        if (result)
            System.out.println(name + "입력 성공");
        else
            System.out.println(name + "입력 실패");
    }
    public void delete(String name) {
        boolean result = dao.delete(name);
        if (result)
            System.out.println(name +"학생의 데이터를 삭제했습니다.");
        else
            System.out.println(name +"학생은 존재하지 않습니다.");

    }
    public void update(String name, int score) {
        StudentEntity entity = new StudentEntity();
        entity.setName(name);
        entity.setScore(score);
        boolean result = dao.updateStudent(entity);
        if (result)
            System.out.println(name +"학생의 점수를 변경했습니다.");
        else
            System.out.println(name +"학생은 존재하지 않습니다.");
    }
    public void close() {
        dao.close();
    }

}