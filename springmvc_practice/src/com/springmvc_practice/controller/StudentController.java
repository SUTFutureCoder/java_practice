package com.springmvc_practice.controller;

import com.springmvc_practice.model.Student;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    private static List<Student> studentList = new ArrayList<Student>();

    static {
        studentList.add(new Student(1, "test1", 12));
        studentList.add(new Student(2, "test2", 12));
        studentList.add(new Student(3, "test3", 13));
    }

    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student/list");
        mav.addObject("studentList", studentList);
        return mav;
    }

    @RequestMapping("/preSave")
    public ModelAndView preSave(@RequestParam(value = "id", required = false) String id) {
        ModelAndView mav = new ModelAndView();
        if (id != null) {
            mav.addObject("student", studentList.get(Integer.parseInt(id) - 1));
            mav.setViewName("student/update");
        } else {
            mav.setViewName("student/add");
        }
        return mav;
    }

    @RequestMapping("/save")
    public String save(Student student) {
        if (student.getId() != 0) {
            Student s = studentList.get(student.getId() - 1);
            s.setAge(student.getAge());
            s.setName(student.getName());
        } else {
            studentList.add(student);
        }

        // 重定向到student/list.form
//        return "redirect:/student/list.form";
        // 转发到controller中，浏览器地址不会变
        return "forward:/student/list.do";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(name = "id") int id) {
        studentList.remove(id - 1);
        return "redirect:/student/list.form";
    }
}
