package com.example.sysintspringdemo.controllers;

import com.example.sysintspringdemo.models.BookLombok;
import com.example.sysintspringdemo.repo.BookDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    //Beter sig som om de vore static....
    BookDao bd = new BookDao();
    List<BookLombok> books = bd.getList();


    @RequestMapping("/books")
    public List<BookLombok> getAllBooks(){
        return books;
    }

    @RequestMapping("/MyBestBook")
    public BookLombok returnLB(){
        BookLombok bl = new BookLombok();
        bl.setId(1);
        bl.setAuthor("Astrid Lindgren");
        bl.setTitle("Emil i Lönneberga");
        return bl;
    }

}
