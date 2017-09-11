package com.spring.boot.beans;

import com.spring.boot.dao.UserDao;
import com.spring.boot.dao.UserDaoImpl;
import com.spring.boot.dao.UserRoleDao;
import com.spring.boot.dao.UserRoleDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource(value = {"classpath:application.properties"})
public class DaoBean {

    @Bean
    public UserDao userDao() {
        return new UserDaoImpl();
    }

    @Bean
    public UserRoleDao userRoleDao() {
        return new UserRoleDaoImpl();
    }
}
