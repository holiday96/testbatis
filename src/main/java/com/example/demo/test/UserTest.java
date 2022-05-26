package com.example.demo.test;

import com.example.demo.config.AppConfig;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

/**
 * @author Dev
 * @version 1.0
 * @since 26.5.2022
 */
@Slf4j
public class UserTest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IUserService userService = (IUserService) context.getBean("userService");

        // create user
        User user1 = new User("test", "email_1@gmail.com", "123", "0123456789", "HNAM", 45);

        // insert user
        userService.insertUser(user1);
        log.info("insert : " + user1);

        // select all user
        List<User> listUsers = userService.selectAll();
        log.info("select all : ");
        for (User user : listUsers) {
            log.info(user.toString());
        }

        // select user by id
        User user2 = userService.selectUserById(1);

        // update user
        user2.setAge(100);
        userService.updateUser(user2);
        log.info("update : " + user2.toString());

//        // delete user by id
//        userService.deleteUserById(user2.getId());
//        log.info("delete : " + user2.toString());
    }
}