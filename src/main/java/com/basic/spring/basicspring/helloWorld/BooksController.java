package com.basic.spring.basicspring.helloWorld;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
    
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1, "life of an hardware", "anurag"));
    }

    @GetMapping("/books-bean")
    public HelloWorldBean getBooksBean() {
        return new HelloWorldBean("Hello world");
    }

    @GetMapping("/books-bean/path/{name}")
    public HelloWorldBean getBooksBeanPath(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }
}
