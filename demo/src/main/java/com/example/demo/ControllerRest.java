package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DatabaseService;

@RestController
@RequestMapping("/prueba")
public class ControllerRest {
    @Autowired
    private DatabaseService databaseService;
    @GetMapping("/hello")
    public String hello(){
        System.out.println("DB Connected: " + databaseService.isDatabaseConnected());
        return "Estado de la conexion: " +  databaseService.isDatabaseConnected();
}
}
