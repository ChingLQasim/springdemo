package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("books")
public class Book {
    private Integer id;
    private String Btype;
    private String name;
    private String Bdesc;
    private String Bisbn;
}
