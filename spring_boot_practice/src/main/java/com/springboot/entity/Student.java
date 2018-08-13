package com.springboot.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 学生信息实体
 */
@Entity
@Table(name = "t_student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message = "姓名不能为空!")
    @Column(length = 50)
    private String name;

    @NotNull(message = "年龄不能为空!")
    @Max(value = 120, message = "蛤蛤蛤蛤蛤蛤蛤")
    @Min(value = 18, message = "年龄必须大于18岁")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
