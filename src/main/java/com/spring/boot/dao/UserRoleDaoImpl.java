package com.spring.boot.dao;

import com.spring.boot.models.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class UserRoleDaoImpl implements UserRoleDao {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void create(UserRole userRole) {
        String sql = "insert into user_roles(username,role) values(?,?)";
        jdbcTemplate.update(sql, new Object[]{userRole.getUsername(), userRole.getRole()});
    }
}