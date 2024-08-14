package com.digit.LMSApp.LmsService;

import com.digit.LMSApp.Payload.ReviewDto;

public interface ReviewService {

	ReviewDto addReview(ReviewDto rdto);


	String DeleteReview(int rid);

}
