package com.ion.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ion.entity.User;

public interface userMapper {

    User getUserById(int id);

    @Select("SELECT * FROM tb_users WHERE id = #{id}")
    User getArticle(@Param("id") int id);

    @Select("SELECT * FROM tb_users WHERE username = #{username}")
    User getUserbyUsername(@Param("username") String username);

}