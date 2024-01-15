package com.example.jingxin.controller;

import com.example.jingxin.entity.User;
import com.example.jingxin.service.UserService;
import com.example.jingxin.utils.Result;
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
    public Map<String, Object> Login(User user, HttpSession session) {
        Map<String, Object> map = userService.login(user);
        if ((int) map.get("code") == 200) {
            session.setAttribute("user", user);
        }
        return map;
    }

    @ResponseBody
    @PostMapping("/logout")
    public Map<String, Object> Logout(HttpSession session) {
        System.out.println("用户退出登录");
        session.removeAttribute("user");
        return Result.code(200);
    }
}
