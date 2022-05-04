package com.example.sysintspringdemo.repo;

import com.example.sysintspringdemo.models.BookLombok;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
    List<BookLombok> books = new ArrayList<BookLombok>();

    public BookDao(){
        BookLombok bl = new BookLombok();
        bl.setId(1);
        bl.setAuthor("Astrid Lindgren");
        bl.setTitle("Emil i Lönneberga");

        BookLombok b2 = new BookLombok();
        b2.setId(2);
        b2.setAuthor("Astrid Lindgren");
        b2.setTitle("Ronja Rövardotter");

        BookLombok b3 = new BookLombok();
        b3.setId(3);
        b3.setAuthor("Astrid Lindgren");
        b3.setTitle("Pippi på de 7 haven");

        books.add(bl);
        books.add(b2);
        books.add(b3);

    }

    public List<BookLombok> getList(){
        return books;
    }

}
