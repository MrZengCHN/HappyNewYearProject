package com.example.jingxin.controller;

import com.example.jingxin.entity.Award;
import com.example.jingxin.service.AwardService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    @Resource
    private AwardService awardService;

    @GetMapping({"/", "/index"})
    public String Index() {
        return "index";
    }

    @GetMapping("/item1")
    public String Item1(Model model) {
        List<Award> list = awardService.list();
        model.addAttribute("awards", list);
        return "item1";
    }
}
