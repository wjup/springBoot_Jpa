package com.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Author:abc
 * @Description:
 * @params:$params$
 * @return: $returns$
 * @Date: $date$ $time$
 */

@Entity
@Table(name = "t_user")
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)//id生成策略自动增长
    //配置uuid，本来jpa是不支持uuid的，但借用hibernate的方法可以实现。
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String userName;
    private String password;
    private String phone;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
