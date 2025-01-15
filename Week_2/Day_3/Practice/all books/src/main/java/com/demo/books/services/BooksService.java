package com.demo.books.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.demo.books.models.BooksModel;
import com.demo.books.repositories.BooksRepository;

@Service
public class BooksService {
 // adding the book repository as a dependency
private final BooksRepository booksRepository;
    
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }
    // returns all the books
    public List<BooksModel> allBooks() {
        return booksRepository.findAll();
    }
    // creates a book
    public BooksModel createBook(BooksModel b) {
        return booksRepository.save(b);
    }
    // retrieves a book
    public BooksModel findBook(Long id) {
        Optional<BooksModel> optionalBook = booksRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
  }
    public BooksModel updateBook(Long id, BooksModel BooksModel) {
    	// TODO Auto-generated method stub
    	BooksModel currentBook=this.findBook(id);
    	currentBook.setTitle(BooksModel.getTitle());
    	currentBook.setDescription(BooksModel.getDescription());
    	currentBook.setLanguage(BooksModel.getLanguage());
    	currentBook.setNumberOfPages(BooksModel.getNumberOfPages());
    	
    	return booksRepository.save(currentBook);
    }
    public void deleteBook(Long id) {
    	// TODO Auto-generated method stub
    	booksRepository.deleteById(id);
    }
//	public BooksModel updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
//		// TODO Auto-generated method stub
//		BooksModel currentBook=this.findBook(id);
//    	currentBook.setTitle(BooksModel.getTitle());
//    	currentBook.setDescription(BooksModel.getDescription());
//    	currentBook.setLanguage(BooksModel.getLanguage());
//    	currentBook.setNumberOfPages(BooksModel.getNumberOfPages());
//    	
//    	return booksRepository.save(null);
//		return null;
//	}
}

