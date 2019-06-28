package com.itheima.service;

import com.itheima.pojo.Student;

import java.util.List;
public interface StudentService {
    List<Student> findAll();

    void add(Student student);


    Student findOne(Integer id);

    void update(Student student);

    void del(Integer[] ids);
}
