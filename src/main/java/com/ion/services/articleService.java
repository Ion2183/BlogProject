package com.ion.services;

import java.net.http.HttpRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ion.entity.Article;
import com.ion.mapper.articleMapper;

import jakarta.servlet.http.HttpServletRequest;
@Controller
public class articleService {

    @Autowired
    private articleMapper ar;
    @GetMapping("/getAllArticles")
    @ResponseBody
    public Article[] getAllArticles(){
        Article[] articleTest=ar.getAllArticles();

        return articleTest;

    }
    
    @GetMapping("/insertArticle")
    @ResponseBody
    public ResponseResult insertArticles(HttpServletRequest httpServletRequest){
        Date currentDate=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        ar.insertArticle(httpServletRequest.getParameter("title"), httpServletRequest.getParameter("content"), sf.format(currentDate));
        System.out.println(sf.format(currentDate));
        return new ResponseResult(1, "success");
    }
}
