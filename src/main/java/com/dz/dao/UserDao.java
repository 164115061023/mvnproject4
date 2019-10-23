package com.dz.dao;

import com.dz.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Insert("insert into t_user(username,password) values(#{username},#{password})")
    void save(User user);

    @Select("select * from t_user")
    List<User> findPage();
}
