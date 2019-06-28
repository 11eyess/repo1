package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //session 一次回话
    //request 一次请求

    @RequestMapping("login")
    public String login(HttpSession session,HttpServletRequest request, String name, String password){
        System.out.println(name);
        System.out.println(password);
        User user = userService.findUser(name, password);
        System.out.println(user);
        if(user!=null){
            session.setAttribute("user",user);
            return "redirect:/student/findAll.do";
        }else{
            System.out.println("用户名密码错误" );
            request.setAttribute("msg","用户名密码不对");
            return "login";
        }
    }


}
