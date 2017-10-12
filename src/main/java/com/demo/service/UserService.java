package com.demo.service;

import com.demo.domain.User;

/**
 * Created by yaolijun on 2017/10/11.
 */
public interface UserService {

    User selectUserById(Integer userId);
}
