package com.example.jingxin.controller;

import com.example.jingxin.entity.User;
import com.example.jingxin.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class LoginController {
    @Resource
    private UserService userService;

    @GetMapping("/login")
    public String Login() {
        return "login";
    }
    @ResponseBody
    @PostMapping("/login")
    public Map<String,Object> Login(User user, HttpSession session){
        Map<String,Object> map = userService.login(user);
        System.out.println(user.getUsername());
        return null;
    }
}
