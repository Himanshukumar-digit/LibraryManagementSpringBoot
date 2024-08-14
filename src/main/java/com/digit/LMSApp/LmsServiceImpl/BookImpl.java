package com.digit.LMSApp.LmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.LMSApp.Entity.Book;
import com.digit.LMSApp.LmsService.BookService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Repository.BookRepository;

@Service
public class BookImpl implements BookService {
	@Autowired

	private BookRepository brepo;

	@Override
	public BookDto addBook(BookDto bdto) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.setBname(bdto.getBname());
		b.setAuthor(bdto.getAuthor());
		b.setCost(bdto.getCost());
		Book bk = brepo.save(b);
		BookDto bookresponse = new BookDto();
		bookresponse.setBname(bk.getBname());
		bookresponse.setAuthor(bk.getAuthor());
		bookresponse.setCost(bk.getCost());

		return bookresponse;
	}

	@Override
	public BookDto getSpecificBook(int bid) {
		// TODO Auto-generated method stub
		Book b = brepo.findById(bid).get();
		BookDto bookresponse = new BookDto();
		bookresponse.setBid(b.getBid());
		bookresponse.setBname(b.getBname());
		bookresponse.setAuthor(b.getAuthor());
		bookresponse.setCost(b.getCost());

		return bookresponse;
	}

	@Override
	public BookDto updateBook(BookDto bdto) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.setBid(bdto.getBid());
		b.setBname(bdto.getBname());
		b.setAuthor(bdto.getAuthor());
		b.setCost(bdto.getCost());
		brepo.save(b);
		return bdto;
	}

	@Override
	public String deleteBook(int bid) {
		// TODO Auto-generated method stub
		brepo.deleteById(bid);

		return "Deleted Successfully";

	}

	@Override
	public List<BookDto> getAll() {
		// TODO Auto-generated method stub
		List<Book> b = brepo.findAll();
		List<BookDto> bd = new ArrayList<BookDto>();
		for (Book book : b) {
			BookDto bdto = new BookDto();
			bdto.setBid(book.getBid());
			bdto.setBname(book.getBname());
			bdto.setAuthor(book.getAuthor());
			bdto.setCost(book.getCost());
			bd.add(bdto);
		}
		return bd;
	}

}
