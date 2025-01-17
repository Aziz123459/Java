package com.demo.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.books.models.BooksModel;

//...
@Repository
public interface BooksRepository extends CrudRepository<BooksModel, Long>{
 // this method retrieves all the books from the database
 List<BooksModel> findAll();
 // this method finds books with descriptions containing the search string
 List<BooksModel> findByDescriptionContaining(String search);
 // this method counts how many titles contain a certain string
 Long countByTitleContaining(String search);
 // this method deletes a book that starts with a specific title
 Long deleteByTitleStartingWith(String search);
}


