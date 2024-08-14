package com.digit.LMSApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.LMSApp.LmsService.ReviewService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.ReviewDto;

@RestController
@RequestMapping("review")

public class ReviewController {
	@Autowired
	ReviewService rservice;
	@PostMapping

	public ResponseEntity<ReviewDto> addReview(@RequestBody ReviewDto rdto) {

		return new ResponseEntity<>(rservice.addReview(rdto), HttpStatus.CREATED);

	}
	@DeleteMapping("deleteR/{rid}")
	public ResponseEntity<String> DeleteReview(@PathVariable int rid) {
		return new ResponseEntity<String>(rservice.DeleteReview(rid),HttpStatus.OK);
	}

}
