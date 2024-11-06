package mybatis.dao;

import com.example.springlab.domain.StudentDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
//    @Select()
//    public 자료형 메서드명;
//
//    @Insert()
//
//    @Update()
//
//    @Delete()
    @Select("select name, score from student")
    public List<StudentDTO> listAll();
    @Select("select score from student Order BY Desc")
    public List<StudentDTO> listOrderByScoreDesc() ;
    @Select("select score from student where score >= 70")
    public List<StudentDTO> listByScoreGreaterEqualThan70();
    @Select("select name from student where like concat('%','짱','%')")
    public List<StudentDTO> listByContainName();
    @Select("select score from student where name= #{name}")
    public List<StudentDTO> getScore(String name);
    @Select("select avg(score) from student")
    public List<StudentDTO> getScoreAvg();
    @Insert("insert into student( name, score) values (#{name}, #{score})")
    public boolean insert(StudentDTO dto);
    @Delete("delete from student where name = #{name}")
    public boolean delete(String name);

}
