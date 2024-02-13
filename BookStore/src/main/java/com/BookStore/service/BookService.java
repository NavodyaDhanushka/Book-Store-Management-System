package com.BookStore.service;

import com.BookStore.entity.Book;
import com.BookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bRepo;
    public void save(Book book){
        if (Objects.equals(book.getPrice(), "0")){
         book.setPrice("100");
        }

        Book poth = bRepo.save(book);
        System.out.println(poth);

    }
    public List<Book> getAllBook(){

        return bRepo.findAll();
    }
    public Book getBookById(int id){
        return bRepo.findById(id).get();
    }
    public void deleteById(int id){
        bRepo.deleteById(id);
    }
}
