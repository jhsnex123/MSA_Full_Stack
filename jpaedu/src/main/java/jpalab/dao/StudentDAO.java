package jpalab.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jpalab.entity.StudentEntity;

import java.util.List;

public class StudentDAO {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("emptest");

    public StudentDAO() {
        super();
        factory = Persistence.createEntityManagerFactory("emptest");
    }


    public boolean insertStudent(StudentEntity entity) {
        boolean result = true;
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    public List<StudentEntity> getAllStudent(){
        EntityManager em = factory.createEntityManager();
        TypedQuery<StudentEntity> q = em.createQuery("select t from StudentEntity t", StudentEntity.class);
        List<StudentEntity> list = q.getResultList();
        em.close();
        return list;
    }

    public StudentEntity getScore(String name ){
        EntityManager em = factory.createEntityManager();
        StudentEntity entity = em.find(StudentEntity.class, name);
        em.close();
        return entity;
    }

    public boolean updateStudent(StudentEntity entity) {
        boolean result = true;
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            StudentEntity shcVo = em.find(StudentEntity.class, entity.getName());
            System.out.println(shcVo.getScore());
            shcVo.setName(entity.getName());
            shcVo.setScore(entity.getScore());
            em.getTransaction().commit();
        } catch (Exception e) {
            result = false;
        }
        em.close();
        return result;
    }
    public boolean delete(String name){
        boolean result = true;
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            StudentEntity entity = em.find(StudentEntity.class, name);
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            result = false;
        }
        em.close();
        return result;
    }


    public void close() {
    }
}







