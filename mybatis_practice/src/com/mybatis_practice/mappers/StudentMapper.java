package com.mybatis_practice.mappers;

import com.mybatis_practice.model.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    public int add(Student student);

    public int update(Student student);

    public int delete(Integer id);

    public Student findById(Integer id);

    public List<Student> find();

    public Student findStudentWithAddress(Integer id);

    public Student findByGradeId(Integer gradeId);

    public List<Student> searchStudents(Map<String, Object>map);

    public List<Student> searchStudents2(Map<String, Object>map);

    public List<Student> searchStudents3(Map<String, Object>map);

    public List<Student> searchStudents4(Map<String, Object>map);

    public List<Student> searchStudents5(Map<String, Object>map);

    public List<Student> searchStudents6(String name, int age);

    public int updateStudent(Student student);

    public List<Student> findStudents(RowBounds rowBounds);

    public List<Student> findStudents2(Map<String, Object>map);

    @Insert("insert into t_student (id, age, name) values(null, #{age}, #{name})")
    public int add2(Student student);

    @Select("select * from t_student")
    @Results(
            {
                    @Result(id=true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "age", property = "age")
            }
    )
    public List<Student> findStudents3();

    @Select("select * from t_student where id = #{id}")
    @Results(
            {
                    @Result(id=true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "age", property = "age"),
                    @Result(column = "addressId", property = "address", one = @One(select = "com.mybatis_practice.mappers.AddressMapper.findById"))
            }
    )
    public Student selectStudentWithAddress(int id);

    @InsertProvider(type = StudentDynaSqlProvider.class, method = "insertStudent")
    public int insertStudent(Student student);

}
