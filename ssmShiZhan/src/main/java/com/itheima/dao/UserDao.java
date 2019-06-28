package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    //如果mybatis基于注解   方法有多个参数  参数前面加@Param("name")注解
    @Select("select * from t_user where name =#{name} and password =#{password}")
    User findUser(@Param("name") String name, @Param("password")String password);
//    User findUser(Map hashMap);//如果参数是map   #{}中写的是map中的key值  键值




}
