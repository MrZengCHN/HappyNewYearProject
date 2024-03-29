package com.example.jingxin.service;

import com.example.jingxin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
* @author 11643
* @description 针对表【user】的数据库操作Service
* @createDate 2024-01-15 00:37:29
*/
public interface UserService extends IService<User> {

    Map<String, Object> login(User user);
}
