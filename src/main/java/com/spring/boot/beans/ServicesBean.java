package com.spring.boot.beans;

import com.spring.boot.services.login.LoginService;
import com.spring.boot.services.login.LoginServiceImpl;
import com.spring.boot.services.register.RegisterService;
import com.spring.boot.services.register.RegisterServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource(value = {"classpath:application.properties"})
public class ServicesBean {

    @Bean
    public RegisterService registerService() {
        return new RegisterServiceImpl();
    }

    @Bean
    public LoginService loginService() {
        return new LoginServiceImpl();
    }
}
