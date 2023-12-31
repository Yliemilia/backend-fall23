package com.example.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository bookRepository, CategoryRepository categoryRepository) {
		return (args) -> {
			log.info("save books");
			categoryRepository.save(new Category("Horror"));
			categoryRepository.save(new Category("Fantasy"));
			
			bookRepository.save(new Book("Dracula", "Bram Stoker", 1897, "1234-12", 51.00, categoryRepository.findByName("Horror").get(0)));
			bookRepository.save(new Book("Fire and Blood", "George R. R. Martin", 2018, "4321-43", 30.00, categoryRepository.findByName("Fantasy").get(0)));
			
			log.info("fetch all books");
			for (Book book : bookRepository.findAll()) {
				log.info(book.toString());
			}
			
			
		};
	}

}
