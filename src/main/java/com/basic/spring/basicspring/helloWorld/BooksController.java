package com.basic.spring.basicspring.helloWorld;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BooksController {

    @Autowired
    private MessageSource messageSource;

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

    @GetMapping(value = "/hello-world-internationalized")
    public String getMethodName() {
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }

}
