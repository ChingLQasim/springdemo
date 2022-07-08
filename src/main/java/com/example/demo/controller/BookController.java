package com.example.demo.controller;

import com.example.demo.controller.utils.R;
import com.example.demo.domain.Book;
import com.example.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        R r = new R();
        List<Book> b = bookService.list();
        Boolean flag = b != null;
        r.setFlag(flag);
        r.setData(b);
        return r;
    }

    @PostMapping
    public R save(@RequestBody Book book){
        return new R(bookService.save(book));
    }
    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }
    @DeleteMapping("{id}")
    public R save(@PathVariable Integer id) {
        return new R(bookService.removeById(id));
    }
    @GetMapping("{id}")
    public R  getById(@PathVariable Integer id){
        return new R(true, bookService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize){
        return new R(true, bookService.getPage(currentPage, pageSize));
    }
}
