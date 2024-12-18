package jpaexam2.model.dao;

import jpaexam2.model.entity.Emp;
import jpaexam2.model.dto.EmpFreqDTO;
import jakarta.persistence.*;
import java.util.List;

public class EmpDAO {          // 리퍼직토리?
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("emptest");
    EntityManager em = factory.createEntityManager();
    public void close() {
    	em.close();
    	factory.close();
    }
	public Long getAllDataNum() {	
		TypedQuery<Long> q = em.createQuery("select count(t.empno) from Emp t", Long.class);
		return q.getSingleResult();   //empno 갯수값만 리턴
	}
	
	public String getEmpName(Integer numOfEmp) {  //null포함
		Emp e = em.find(Emp.class, numOfEmp); // numOfEmp 오브젝트? jpql이 필요없음 name만 찾는거라
		if (e != null)
			return e.getEname();
		else
			return "없음";
	}

	public List<Emp> findByJob(String job) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t WHERE t.job = :job", Emp.class); //:job 동적 파라미터
		q.setParameter("job", job); 
		List<Emp> resultList = q.getResultList();
		return resultList;
	}

	public List<Emp> findByPartEname(String partEname) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t WHERE t.ename like :pe", Emp.class);  //:pe 동적 파라미터
		q.setParameter("pe", "%"+partEname+"%"); 
		List<Emp> resultList = q.getResultList();
		return resultList;
	}
	
	public List<Emp> findByGreaterThanSal(int sal) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t WHERE t.sal >= :sal", Emp.class);
		q.setParameter("sal", sal); 
		List<Emp> resultList = q.getResultList();
		return resultList;
	}

	public List<Emp> findByEnameAndJob1(String ename, String job) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t WHERE t.ename = :ename and t.job = :job", Emp.class);
		q.setParameter("ename", ename); 
		q.setParameter("job", job); 
		List<Emp> resultList = q.getResultList();
		return resultList;
	}

	public Emp findByEnameAndJob2(String ename, String job) {
		TypedQuery<Emp>  q = em.createQuery("SELECT t FROM Emp t WHERE t.ename = ?1 and t.job = ?2", Emp.class);
		q.setParameter(1, ename); 
		q.setParameter(2, job); 
		Emp result = q.getSingleResult();
		return result;
	}
	
	public List<EmpFreqDTO> findByEmpFreqDTO() {
		TypedQuery<EmpFreqDTO>  q = em.createQuery("SELECT new EmpFreqDTO(t.empno, t.ename, t.hiredate, t.sal, t.deptno) FROM Emp t", EmpFreqDTO.class);  //typedquery에는 dto값도 넣을수 있음
		List<EmpFreqDTO> resultList = q.getResultList();         //dto가 하나가 아니기 떄문에 single은 못씀
		return resultList;
	}

	public List<Emp> listPart(int start, int num) {
		TypedQuery<Emp> q = em.createQuery("SELECT t FROM Emp t ORDER BY t.sal DESC", Emp.class);
		q.setFirstResult(start);    // 조회 시작 위치 (0)이 첫번째
		q.setMaxResults(num);       // 조회할 데이터 수
		List<Emp> resultList = q.getResultList();
		return resultList;
	}
	
	public Object[] getGroupFunc() {	
		Query query = em.createQuery("SELECT sum(t.sal), max(t.sal), min(t.sal) FROM Emp t");
		Object[] result = (Object[])query.getSingleResult(); // TypedQuery<EmpFreqDTO>이 없으면 Object[]배열로 받는다       순서  1.TypedQuery<EmpFreqDTO>, 2.Object[]
		return result;
	}
	public String getLocation(String name) {
		TypedQuery<String> q= em.createQuery("Select t.deptno.loc_code.city from Emp t where t.ename =?1",String.class);
		return q.setParameter(1,name).getSingleResult();
	}
}
