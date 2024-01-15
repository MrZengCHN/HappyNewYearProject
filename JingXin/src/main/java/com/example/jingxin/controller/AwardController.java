package com.example.jingxin.controller;

import com.example.jingxin.entity.Award;
import com.example.jingxin.service.AwardService;
import com.example.jingxin.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/award")
public class AwardController {
    @Resource
    private AwardService awardService;

    @PostMapping("/add")
    public Map<String, Object> addAward(Award award) {
        boolean save = awardService.save(award);
        if (save) {
            return Result.code(200);
        } else {
            return Result.code(206);
        }
    }
    @PostMapping("/delete")
    public Map<String, Object> deleteAward(Award award) {
        boolean remove = awardService.removeById(award);
        if (remove) {
            return Result.code(200);
        } else {
            return Result.code(206);
        }
    }
}
