package com.digit.LMSApp.LmsServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.LMSApp.Entity.Book;
import com.digit.LMSApp.Entity.PurchaseBook;
import com.digit.LMSApp.Entity.Subscription;
import com.digit.LMSApp.Entity.User;
import com.digit.LMSApp.LmsService.SubscriptionService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.PurchaseDto;
import com.digit.LMSApp.Payload.SubscriptionDto;
import com.digit.LMSApp.Repository.BookRepository;
import com.digit.LMSApp.Repository.SubscriptionRepository;
import com.digit.LMSApp.Repository.UserRepository;
@Service
public class SubscriptionImpl implements SubscriptionService {
	@Autowired
	SubscriptionRepository srepo;
	@Autowired
	BookRepository brepo;
	@Autowired
	UserRepository urepo;





	

}
