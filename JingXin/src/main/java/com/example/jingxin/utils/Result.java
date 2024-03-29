package com.example.jingxin.utils;

import java.util.HashMap;
import java.util.Map;

public class Result {
    public static Map<String, Object> code(int code) {
        Map<String,Object> result = new HashMap<>();
        result.put("code",code);
        switch (code) {
            case 200 -> result.put("message", "请求成功");
            case 203 -> result.put("message", "用户不存在");
            case 204 -> result.put("message", "用户状态异常");
            case 205 -> result.put("message", "密码错误");
            case 206 -> result.put("message", "奖品添加失败");
        }
        return result;
    }
}
