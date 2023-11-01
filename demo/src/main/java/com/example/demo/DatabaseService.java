package com.example.demo;

import java.util.List;
import java.util.Map;

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
 
   /* public List<String> queryData() {
        List<String> myList = null;
       try {
          myList = jdbcTemplate.queryForList("SELECT titulo FROM test.prueba", String.class);
          System.out.println(myList);
          return myList;
       } catch (Exception e) {
           System.out.println(e);
           return myList;
       }
    }*/
    public List<Map<String, Object>>  queryData() {
        List<Map<String, Object>> myList = null;
        try {
           myList = jdbcTemplate.queryForList("SELECT * FROM test.prueba");
           System.out.println(myList);
           return myList;
        } catch (Exception e) {
            System.out.println(e);
            return myList;
        }
    }

}