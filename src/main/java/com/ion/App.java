package com.ion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.ion.entity.Article;
import com.ion.entity.User;
import com.ion.mapper.articleMapper;
import com.ion.mapper.userMapper;

/**
 * Hello world!
 *
 */

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mvc.xml");
        // userMapper us = (userMapper) context.getBean("usermapper");

        // User user = us.getUserbyUsername("ddd");
        // System.out.println(user.getLoginname());

        articleMapper ar = (articleMapper) context.getBean("articleMapper");
        // Article[] articleTest=ar.getAllArticles();

        // for (Article article : articleTest) {
        // System.out.println(article.toString());
        // }
        boolean result = ar.insertArticle("null", "null", "1998-12-09 00:00:00");
        System.out.println(result);
    }
}
