package com.example.jingxin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.jingxin.entity.User;
import com.example.jingxin.mapper.UserMapper;
import com.example.jingxin.service.UserService;
import com.example.jingxin.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 11643
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2024-01-15 00:37:29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Map<String, Object> login(User user) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, user.getUsername());
        List<User> users = userMapper.selectList(wrapper);
        if (users.size()<1){
            return Result.code(203);
        }else if (users.size()>1){
            return Result.code(204);
        }

        return null;
    }
}




