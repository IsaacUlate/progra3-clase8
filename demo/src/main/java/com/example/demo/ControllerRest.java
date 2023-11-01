package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class ControllerRest {
    @Autowired
    private DatabaseService databaseService;
    @GetMapping("/hello")
    public List<Map<String, Object>>  hello(){
    return databaseService.queryData();
}

}
