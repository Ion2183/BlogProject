package com.ion.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ion.controller.UesrController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class loginService {
    @Autowired
    private UesrController usercontroller;

    @GetMapping("/")
    public String index(HttpSession session) {
        return "index.html";
        //return "index.html";
    }

    @PostMapping(value = "/login",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseResult login(HttpServletRequest req, HttpServletResponse resp,ModelAndView modelAndView, HttpSession httpSession) {
        ResponseResult result=new ResponseResult(0,"aaa");
        //resp.setHeader("Accept", "*/*");
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        String expectedPassword = usercontroller.getPasswordByUsername(name);
        if (expectedPassword != null && expectedPassword.equals(password)) {
            // 登录成功:
            req.getSession().setAttribute("user", name);
            Cookie cookie=new Cookie(password, expectedPassword);
            resp.addCookie(cookie);
            result.setState(1);
            result.setMessage("succeed");
            return result;
        } else {

            result.setState(0);
            result.setMessage("failed");
            return result;

        }
    }

}
