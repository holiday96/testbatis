package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Dev
 * @version 1.0
 * @since 26.5.2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String address;
    private int age;

    public User(String fullName, String email, String password, String phone, String address, int age) {
        this.fullName = fullName;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.age = age;
    }
}
