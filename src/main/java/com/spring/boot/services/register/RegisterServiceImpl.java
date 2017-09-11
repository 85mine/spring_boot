package com.spring.boot.services.register;

import com.spring.boot.dao.UserDao;
import com.spring.boot.dao.UserRoleDao;
import com.spring.boot.models.User;
import com.spring.boot.models.UserRole;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterServiceImpl implements RegisterService {

    @Autowired
    UserDao userDao;

    @Autowired
    UserRoleDao userRoleDao;

    public void register(User user) {
        userDao.create(user);
        userRoleDao.create(new UserRole(user.getUsername(), "ROLE_MEMBER"));
    }
}
