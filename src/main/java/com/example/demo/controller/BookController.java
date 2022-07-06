package com.example.demo.controller;

import com.example.demo.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private Environment env;
    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println(myDataSource);
        return "running";
    }
}
