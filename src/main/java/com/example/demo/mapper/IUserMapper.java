package com.example.demo.mapper;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author Dev
 * @version 1.0
 * @since 26.5.2022
 */
public interface IUserMapper {
    int insertUser(User user);

    int updateUser(User user);

    int deleteUserById(int userId);

    List<User> selectAllUser();

    User selectUserById(int userId);
}
