package com.digit.LMSApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.LMSApp.Entity.Book;
import com.digit.LMSApp.LmsService.BookService;
import com.digit.LMSApp.Payload.BookDto;

@RestController
@RequestMapping("/Library")
public class BookController {
	@Autowired
	BookService bookService;

	@PostMapping

	public ResponseEntity<BookDto> addBook(@RequestBody BookDto bdto) {

		return new ResponseEntity<>(bookService.addBook(bdto), HttpStatus.CREATED);

	}

	@GetMapping("getById/{bid}")

	public ResponseEntity<BookDto> getSpecificPost(@PathVariable int bid) {

		return new ResponseEntity<>(bookService.getSpecificBook(bid), HttpStatus.CREATED);

	}

	@PutMapping("update")
	public ResponseEntity<BookDto> updatePost(@RequestBody BookDto bdto) {

		return new ResponseEntity<>(bookService.updateBook(bdto), HttpStatus.CREATED);

	}

	@DeleteMapping("delete/{bid}")
	public ResponseEntity<String> deleteBook(@PathVariable int bid) {
		return new ResponseEntity<>(bookService.deleteBook(bid), HttpStatus.CREATED);

	}

	@GetMapping("getbook")
	public ResponseEntity<List<BookDto>> getAll() {

		return new ResponseEntity<>(bookService.getAll(), HttpStatus.CREATED);

	}

}
