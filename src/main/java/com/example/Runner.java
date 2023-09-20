package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * https://github.com/aws/aws-secretsmanager-jdbc
 */
@Component
public class Runner implements CommandLineRunner {

//    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    public Runner(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void run(String... args) {
//        Map<String, Object> map = jdbcTemplate.queryForMap("SELECT CURRENT_DATE() FROM DUAL");
//        System.out.println(map);
    }
}
