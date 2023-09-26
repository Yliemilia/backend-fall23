package com.example.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.CategoryRepository;

@Controller
public class BookController {
	
	@Autowired
	BookRepository brepository;
	@Autowired
	CategoryRepository crepository;
	
	@GetMapping("/booklist")
	public String showBooks(Model model) {
		model.addAttribute("books", brepository.findAll());
		return "booklist";
	}
	
	@GetMapping("/add")
    public String addBook(Model model){
    	model.addAttribute("book", new Book());
    	model.addAttribute("categories", crepository.findAll());
        return "addbook";
    }
	
	@GetMapping("editBook/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("editBook", brepository.findById(id));
		model.addAttribute("categories", crepository.findAll());
		return "editBook";
	}
	
	@PostMapping("/save")
    public String save(Book book){
        brepository.save(book);
        return "redirect:booklist";
    } 
	
	@GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long bookId, Model model) {
    	brepository.deleteById(bookId);
        return "redirect:../booklist";
    }
	
}
