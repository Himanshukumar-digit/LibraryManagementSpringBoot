package com.digit.LMSApp.LmsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.LMSApp.Entity.Book;
import com.digit.LMSApp.Entity.ReviewBook;
import com.digit.LMSApp.Entity.User;
import com.digit.LMSApp.LmsService.ReviewService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.ReviewDto;
import com.digit.LMSApp.Repository.BookRepository;
import com.digit.LMSApp.Repository.ReviewRepository;
import com.digit.LMSApp.Repository.UserRepository;
@Service

public class ReviewServiceImpl implements ReviewService{
	@Autowired
	ReviewRepository rrepo;
	@Autowired
	BookRepository brepo;
	@Autowired
	UserRepository urepo;

	@Override
	public ReviewDto addReview(ReviewDto rdto) {
		// TODO Auto-generated method stub
		ReviewBook rb = new ReviewBook();
		rb.setComment(rdto.getComment());
		rb.setUser(urepo.findById(rdto.getUid()).get());
		rb.setBook(brepo.findById(rdto.getBid()).get());
		
	
		ReviewBook bk = rrepo.save(rb);
		ReviewDto reviewresponse = new ReviewDto();
		reviewresponse.setComment(bk.getComment());
	      reviewresponse.setUid(bk.getUser().getUid());
	      reviewresponse.setBid(bk.getBook().getBid());
		
		return reviewresponse;
		
	}

	@Override
	public String DeleteReview(int rid) {
		// TODO Auto-generated method stub
//		ReviewBook rb = rrepo.findById(rid).get();
		rrepo.deleteById(rid);
		
		
		return null;
	}

	

}
