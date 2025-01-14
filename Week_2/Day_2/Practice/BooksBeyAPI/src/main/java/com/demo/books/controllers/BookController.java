package com.demo.books.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.books.models.BooksModel;
import com.demo.books.services.BooksService;



@Controller
public class BookController {
 private final BooksService booksService;
 public BookController(BooksService booksService){
     this.booksService = booksService;
 }
 @RequestMapping("/books")
 public List<BooksModel> index() {
     return booksService.allBooks();
 }
 
 @RequestMapping(value="/books", method=RequestMethod.POST)
 public BooksModel create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	 BooksModel book = new BooksModel(title,desc,lang,numOfPages);
     return booksService.createBook(book);
 }
 
 @GetMapping("/book/{id}")
 public String findOneBookById(@PathVariable("id") Long id, Model model) {
     BooksModel selectedBook = booksService.findBook(id);
     model.addAttribute("book",selectedBook);
     return "show.jsp";
 }
 // other methods removed for brevity
 @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
 public BooksModel update(
 		@PathVariable("id") Long id, 
 		@RequestParam(value="title") String title, 
 		@RequestParam(value="description") String desc, 
 		@RequestParam(value="language") String lang,
 		@RequestParam(value="pages") Integer numOfPages) {
	 BooksModel book = new BooksModel(title,desc,lang,numOfPages);
	 book = booksService.updateBook(id,book);
     return book;
 }
 
 public BooksService getBooksService() {
	return booksService;
}
@RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
 public void destroy(@PathVariable("id") Long id) {
     booksService.deleteBook(id);
 }
}

