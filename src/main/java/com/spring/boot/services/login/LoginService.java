package com.spring.boot.services.login;

import com.spring.boot.models.User;

public interface LoginService {
    String[] validate(User user);
}
