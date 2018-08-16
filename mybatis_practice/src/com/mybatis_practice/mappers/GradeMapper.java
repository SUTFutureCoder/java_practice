package com.mybatis_practice.mappers;

import com.mybatis_practice.model.Address;
import com.mybatis_practice.model.Grade;
import org.apache.ibatis.annotations.*;

public interface GradeMapper {

    @Select("select * from t_grade where id=#{id}")
    @Results(
            {
                    @Result(id=true, column = "id", property = "id"),
                    @Result(column = "gradeName", property = "gradeName"),
                    @Result(column = "id", property = "students", many = @Many(select = "com.mybatis_practice.mappers.StudentMapper.findByGradeId"))
            }
    )
    public Grade findById(Integer id);

}
