package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/bookweb")
public class BookListApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookListApplication.class, args);
	}

	@GetMapping
	public bookList getBook(@RequestParam int id ) {
		Map<Integer, bookList> bookRepo = new HashMap<>();
		bookRepo.put(1, new bookList(1, "The Great Gatsby", "F. Scott Fitzgerald"));
		bookRepo.put(2, new bookList(2, "1984", "George Orwell"));
		bookRepo.put(3, new bookList(3, "To Kill a Mockingbird", "Harper Lee"));

		return bookRepo.getOrDefault(id, null);
	}

	@PostMapping
	public String createBook(@RequestBody bookList book) {
		Map<Integer, bookList> bookRepo = new HashMap<>();
		if (bookRepo.containsKey(book.getId())) {
			return "Book with this ID already exists.";
		} else {
			bookRepo.put(book.getId(), book);
			return "Book created: " + book.getTitle();
		}	
	}

	@PutMapping
	public String updateBook(@RequestBody bookList book) {
		Map<Integer, bookList> bookRepo = new HashMap<>();
		if (bookRepo.containsKey(book.getId())) {
			bookRepo.put(book.getId(), book);
			return "Book updated: " + book.getTitle();
		} else {
			return "Book not found.";
		}
	}

	@DeleteMapping
	public String deleteBook(@RequestParam int id) {
		Map<Integer, bookList> bookRepo = new HashMap<>();
		if (bookRepo.containsKey(id)) {
			bookRepo.remove(id);
			return "Book with ID " + id + " deleted.";
		} else {
			return "Book not found.";
		}
	}
}