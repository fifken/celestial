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

@RestController
@RequestMapping("/api/hello")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/World")
		public String getHello(@RequestParam(defaultValue = "World") String name) {
		return String.format("Hello, %s!", name);
	}
	@PostMapping
	public String postHello(@RequestBody HelloRequest request) {
		return String.format("Hello created for %s!", request.getName());
	}
	@PutMapping
	public String putHello(@RequestBody HelloRequest request) {
		return String.format("Hello updated to %s!", request.getName());
	}
	@DeleteMapping
	public String deleteHello(@RequestParam String name) {
		return String.format("Hello deleted for %s!", name);
	}
}
