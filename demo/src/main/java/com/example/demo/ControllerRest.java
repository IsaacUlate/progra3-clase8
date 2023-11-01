package com.example.demo;

import java.util.List;

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
    public List<String> hello(){
        System.out.println("DB Connected: " + databaseService.queryData());
        return databaseService.queryData();
}
}
