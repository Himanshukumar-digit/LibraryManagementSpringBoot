package com.digit.LMSApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.LMSApp.LmsService.SubscriptionService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.PurchaseDto;
import com.digit.LMSApp.Payload.SubscriptionDto;
import com.digit.LMSApp.Repository.SubscriptionRepository;

@RestController
@RequestMapping("/subscribe")
public class SubscriptionController {
	@Autowired
	SubscriptionService sService;
	
//	@GetMapping("getId/{bid}")
//
//	public ResponseEntity<SubscriptionDto> getSubscription(@PathVariable int bid) {
//
//		return new ResponseEntity<>(sService.getSubscription(bid), HttpStatus.CREATED);
//
//	}
//	@PostMapping
//
//	public ResponseEntity<SubscriptionDto> addSubscription(@RequestBody SubscriptionDto sdto) {
//
//		return new ResponseEntity<>(sService.addSubscription(sdto), HttpStatus.CREATED);
//
//	}
//	


}
