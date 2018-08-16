package com.mybatis_practice.mappers;

import com.mybatis_practice.model.Student;
import org.apache.ibatis.jdbc.SQL;

public class StudentDynaSqlProvider {

    public String insertStudent(final Student student) {
        return new SQL(){{
                INSERT_INTO("t_student");
                if (student.getName() != null) {
                    VALUES("name", "#{name}");
                }
                if (student.getAge() != null) {
                    VALUES("age", "#{age}");
                }
            }
        }.toString();
    }

}
