package com.demo.test;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserService单元测试
 * Created by yaolijun on 2017/10/11.
 */
public class UserServiceTest extends SpringTestCase {
    Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;


    @Test
    public void selectUserByIdTest() {
        User user = userService.selectUserById(10);
        logger.debug("查找结果" + user);
    }
}
