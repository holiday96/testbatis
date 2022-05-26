package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author Dev
 * @version 1.0
 * @since 26.5.2022
 */
public interface IUserService {

    int insertUser(User user);

    int updateUser(User user);

    int deleteUserById(int userId);

    List<User> selectAll();

    User selectUserById(int userId);

}
