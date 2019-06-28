package com.itheima.dao;

import com.itheima.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();

    void add(Student student);

    //#{} 表示占位   接受简单类型时，大括号中随意写,  接受pojo 大括号写属性名 防止sql注入   类似与prepareStement   ？
    //${} 表示拼接   接受简单类型时，大括号 只能写value  '1 or drop  t_student'
    @Select("select * from t_student where id =${value}")
    Student findOne(Integer id);


    @Update("update t_student set name =#{name}, sex=#{sex}, age=#{age}, address=#{address} where id=#{id} ")
    void update(Student student);

//    void del(Integer[] ids);
    void del(List ids);


}
