package com.spring.boot.services.register;

import com.spring.boot.dao.UserDao;
import com.spring.boot.models.User;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterServiceImpl implements RegisterService {

    @Autowired
    UserDao userDao;

    public void register(User user) {
        userDao.create(user);
    }
}
