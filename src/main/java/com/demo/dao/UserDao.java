package com.demo.dao;

import com.demo.domain.User;

/**
 * Created by yaolijun on 2017/10/11.
 */
public interface UserDao {

    User selectUserById(Integer userId);
}
