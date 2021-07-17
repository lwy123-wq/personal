package com.example.demo.dao;

import com.example.demo.entiey.User;
import com.example.demo.servermpi.UserServicempl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class UserDao implements UserServicempl {
    @Autowired
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    @Override
    public int ResUser(User user) {
        String sql = "INSERT INTO aaa.User(id,name)VALUES(?,?)";

        return jdbcTemplate.update(sql,user.id,user.name);

    }
}
