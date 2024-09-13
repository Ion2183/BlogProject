package com.ion.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ion.entity.Article;
import com.ion.entity.User;

public interface articleMapper {
    @Select("SELECT * FROM article WHERE id = #{id}")
    Article getArticle(@Param("id") int id);
    @Select("SELECT * FROM article")
    Article[] getAllArticles();
    @Insert("INSERT INTO article (title, content, createdtime) VALUES (#{title},#{content}, #{createdtime}); ")
    Boolean insertArticle(@Param("title")String title,@Param("content") String content, @Param("createdtime")String createdtime);    
}