package com.itheima.test;

import com.itheima.dao.StudentDao;
import com.itheima.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DaoTest {

    @Autowired
    StudentDao studentDao;

    @Test
    public void testFindAll(){
        List<Student> list = studentDao.findAll();
        System.out.println(list);
    }

    @Test
    public void testFindOne(){
        Student student = studentDao.findOne(2);
        System.out.println(student);
    }
}
