package com.example.demo;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
 
@Service
public class DatabaseService {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
 
    public boolean isDatabaseConnected() {
        try {
            jdbcTemplate.queryForObject("SELECT 1 FROM DUAL", Integer.class);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 
        public boolean queryData() {
        try {
           List<String> myList = jdbcTemplate.queryForList("SELECT logMessage FROM test.app_log", String.class);
           System.out.println(myList);
           return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}