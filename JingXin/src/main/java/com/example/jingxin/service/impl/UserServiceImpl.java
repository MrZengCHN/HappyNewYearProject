package com.example.jingxin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.jingxin.entity.User;
import com.example.jingxin.service.UserService;
import com.example.jingxin.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 11643
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-01-14 23:53:22
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




