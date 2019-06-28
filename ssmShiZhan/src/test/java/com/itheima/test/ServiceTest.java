package com.itheima.test;

import com.itheima.pojo.Student;
import com.itheima.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ServiceTest {
    @Autowired
    StudentService studentService;

    @Test
    public void testFindAll(){
        List<Student> list = studentService.findAll();
        System.out.println(list);
    }
}
