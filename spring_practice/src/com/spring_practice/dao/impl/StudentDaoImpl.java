package com.spring_practice.dao.impl;

import com.spring_practice.dao.StudentDao;
import com.spring_practice.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

//    private JdbcTemplate jdbcTemplate;
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public int addStudent(Student student) {
        String sql = "insert into t_student (age, name) values(?, ?)";
        Object []params = new Object[]{student.getAge(), student.getName()};
        return this.getJdbcTemplate().update(sql, params);
    }

    public int addStudentNamedParameter(Student student) {
        String sql = "insert into t_student (age, name) values(:name, :value)";
        MapSqlParameterSource sps = new MapSqlParameterSource();
        sps.addValue("name", student.getName());
        sps.addValue("age", student.getAge());
        return namedParameterJdbcTemplate.update(sql, sps);
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update t_student set name=?, age=? where age=?";
        Object []params = new Object[]{student.getName(), student.getAge(), student.getAge()};
        return this.getJdbcTemplate().update(sql, params);
    }

    @Override
    public int deleteStudent(int id) {
        String sql = "delete from t_student where id=?";
        Object []params = new Object[]{id};
        return this.getJdbcTemplate().update(sql, params);
    }

    @Override
    public List<Student> findStudents() {
        String sql = "select * from t_student";
        // 涉及内部类编译共享变量
        final List<Student> studentList = new ArrayList<Student>();
        this.getJdbcTemplate().query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                studentList.add(student);
            }
        });
        return studentList;
    }
}
