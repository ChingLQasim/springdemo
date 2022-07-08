package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.Book;
import org.springframework.stereotype.Service;


public interface IBookService extends IService<Book> {
    IPage<Book> getPage(int currentPage, int pageSize);
}
