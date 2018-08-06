package com.springboot.controller;

import com.springboot.entity.Student;
import com.springboot.impl.StudentServiceImpl;
import com.springboot.service.StudentService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 添加学生信息
     *
     * @param student
     * @param bindingResult
     * @return
     */
    @RequestMapping("/add")
    public String add(@Valid Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldError().getDefaultMessage();
        }
        studentService.add(student);
        return "添加成功";
    }

}
