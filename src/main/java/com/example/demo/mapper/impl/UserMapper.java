package com.example.demo.mapper.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.IUserMapper;
import com.example.demo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Dev
 * @version 1.0
 * @since 26.5.2022
 */
@Repository
public class UserMapper implements IUserMapper {
    @Override
    public int insertUser(User user) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        int status = session.insert("insertUser", user);
        session.commit();
        session.close();
        return status;
    }

    @Override
    public int updateUser(User user) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        int status = session.update("updateUser", user);
        session.commit();
        session.close();
        return status;
    }

    @Override
    public int deleteUserById(int userId) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        int status = session.delete("deleteUserById", userId);
        session.commit();
        session.close();
        return status;
    }

    @Override
    public List<User> selectAllUser() {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        List<User> list = session.selectList("selectAllUser");
        session.commit();
        session.close();
        return list;
    }

    @Override
    public User selectUserById(int userId) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        User user = session.selectOne("selectUserById", userId);
        session.commit();
        session.close();
        return user;
    }
}
