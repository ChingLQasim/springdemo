package com.example.demo;

import com.example.demo.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.service.BookService;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private IBookService bookService;

    @Test
    void contextLoads() {
        System.out.println(bookService.getById(1));
    }

}
