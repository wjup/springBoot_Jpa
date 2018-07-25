package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;


/**
 * @Author:abc
 * @Description:
 * @params:$params$
 * @return: $returns$
 * @Date: $date$ $time$
 */

public interface UserRepository extends JpaRepository<User,String> ,Serializable {
    @Query(value = "select * from t_user where user_name = ?1 or phone = ?2",nativeQuery = true)
    List<User> seach(String userName,String phone);

}
