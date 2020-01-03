package com.njit.springbootssm.service;

import com.njit.springbootssm.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author:陈晓东
 * @Date:2020/1/1 22:57
 * @Email:2775398338@qq.com
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public String findUsername(String id){
        return userMapper.findUsername(id);
    }
}
