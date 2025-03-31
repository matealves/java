package com.example.api_exemplo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.api_exemplo.domain.Book;

@FeignClient(name = "book-api", url = "https://book-example-api.s3.amazonaws.com/books.json")
public interface BookClient {

    @GetMapping("")
    List<Book> getBooks();
}
