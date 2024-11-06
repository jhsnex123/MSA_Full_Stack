package mybatis.dao;

import com.example.springedu.domain.VisitorDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface VisitorMapper {  // 맵퍼는 다같이 만나서 의논하고 짜기
	@Select("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor")
	public List<VisitorDTO> list();
	@Select("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor where id = #{id}")
	public VisitorDTO one(int id); // VisitorDTO  id값은 db의 프라이머리값 이 셀렉트값은 내 게시판을 수정할 때 씀
	@Select("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor where memo like concat('%', #{key},'%')")
	public List<VisitorDTO> search(String keyword);
	@Insert("insert into visitor (name, writedate, memo) values (#{name}, now(), #{memo})")
	public boolean insert(VisitorDTO visitor);  //#{name}, #{memo})" VisitorDTO 의 프로파티명으로 줘야함
	@Delete("delete from visitor where id = #{id}")
	public boolean delete(String id); // 삭제할 떄는 id값을 찾아서 실행
	@Update("update visitor set name = #{name}, memo = #{memo} where id = #{id}")
	public boolean update(VisitorDTO visitor); //#{name}, memo = #{memo}  여기서 네임과 메모만 바꿈
}
