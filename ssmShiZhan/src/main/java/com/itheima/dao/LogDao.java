package com.itheima.dao;

import com.itheima.pojo.Log;
import org.apache.ibatis.annotations.Insert;

public interface LogDao {
    @Insert("insert into t_log values(#{id},#{name},#{time},#{url},#{cost})")
    void insert(Log log);
}
