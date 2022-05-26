package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.IUserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dev
 * @version 1.0
 * @since 26.5.2022
 */
@Service
public class UserService implements IUserService {

    @Autowired
    IUserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUserById(int userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAllUser();
    }

    @Override
    public User selectUserById(int userId) {
        return userMapper.selectUserById(userId);
    }
}
