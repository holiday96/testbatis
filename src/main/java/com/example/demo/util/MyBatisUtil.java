package com.example.demo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author Dev
 * @version 1.0
 * @since 26.5.2022
 */
public class MyBatisUtil {

    private static SqlSessionFactory sessionFactory;

    static {
        Reader reader;
        try {
            reader = Resources.getResourceAsReader("resources/SqlMapConfig.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sessionFactory;
    }
}
