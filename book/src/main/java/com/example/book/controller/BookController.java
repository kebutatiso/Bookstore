package com.example.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.domain.Book;

@RestController
public class BookController {
	
	@GetMapping("/book")
	public Book findBook() {
		return null;
		
		//I need to see it again
	}

}
