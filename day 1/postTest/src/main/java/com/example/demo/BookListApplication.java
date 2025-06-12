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

import com.example.POSTTEST.BookList;

@RestController
@RequestMapping("/api/BookList")
@SpringBootApplication
public class BookListApplication {

	private Map<Integer, Book> bookRepo = new HashMap<>();
	private int idCounter = 1;

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@GetMapping
	public Book getBook(@RequestParam int id ) {
		return bookRepo.getOrDefault(id, new Book());
	}

	@PostMapping
	public String createBook(@RequestBody BookList book) {
		book.setId(idCounter++);
		bookRepo.put(book.getId(), book);
		return "Successfully created: " + book.getTitle();
	}

	@PutMapping
	public String updateBook(@RequestBody BookList book) {
		if (bookRepo.containsKey(book.getId())) {
			bookRepo.put(book.getId(), book);
			return "Book updated: " + book.getTitle();
		} else {
			return "Book not found.";
		}
	}

	@DeleteMapping
	public String deleteBook(@RequestParam int id) {
		if (bookRepo.remove(id) !=null) {
			return "Book deleted.";
		} else {
			return "Book not found.";
		}
	}
}
