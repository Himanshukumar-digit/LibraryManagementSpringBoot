package com.digit.LMSApp.LmsService;

import java.util.List;

import com.digit.LMSApp.Payload.BookDto;

public interface BookService {
	BookDto addBook(BookDto bdto);

	BookDto getSpecificBook(int bid);

	BookDto updateBook(BookDto bdto);

	String deleteBook(int bid);

	List<BookDto> getAll();

}