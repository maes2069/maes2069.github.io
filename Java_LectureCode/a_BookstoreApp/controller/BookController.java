package com.mycompany.bookstore.controller;
import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.service.BookService;
import com.mycompany.bookstore.service.impl.BookServiceImpl;
public class BookController {
    private BookService bookService;
    public BookController(){
        this.bookService = new BookServiceImpl();
    }
    public Long add(BookDTO bookDTO){
        return this.bookService.add(bookDTO);
    }

}
