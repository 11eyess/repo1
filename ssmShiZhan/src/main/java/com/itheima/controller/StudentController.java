package com.itheima.controller;

import com.itheima.pojo.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();

        List<Student> list = studentService.findAll();
        System.out.println(list);

        modelAndView.addObject("list",list);
        modelAndView.setViewName("list");
        return modelAndView;
    }
    @RequestMapping("add")
    public String add(Student student){
        studentService.add(student);
//        return "redirect:/student/findAll.do";
        return "redirect:findAll.do";

        /**
         * redirect:/student/findAll.do相当于绝对路径  在工程名字 后拼上/student/findAll.do
         *
         * return "redirect:findAll.do";
         *
         * http://localhost:8088/student/findAll.do
         */
    }

    @RequestMapping("findOne")
    public String findOne(Integer id, Model model) {
        Student student = studentService.findOne(id);
        model.addAttribute("stu",student);
        return "update";
    }
    @RequestMapping("update")
    public String update(Student student){//{id:1,}   ?id=1

        studentService.update(student);
        return "redirect:/student/findAll.do";
    }

//    localhost:8088/student/del?ids=1,2
    @RequestMapping("del")
    public String del(Integer[] ids){
        System.out.println(Arrays.toString(ids));

        studentService.del(ids);
        return "redirect:/student/findAll.do";
    }

}
