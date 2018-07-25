package com.example.service;

import com.example.dto.UserDto;
import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author:abc
 * @Description:
 * @params:$params$
 * @return: $returns$
 * @Date: $date$ $time$
 */

public interface UserService {

    boolean add(UserDto userDto);

    boolean del(String userId);

    List<User> findAll();

    UserDto sel(String userId);

    List<User> seach(String userName, String phone);

}
