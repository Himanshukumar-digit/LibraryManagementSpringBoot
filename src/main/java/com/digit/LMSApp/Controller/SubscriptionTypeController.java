package com.digit.LMSApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.LMSApp.Entity.SubscriptionType;
import com.digit.LMSApp.LmsService.SubscriptionTypeService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.SubscriptionDto;
import com.digit.LMSApp.Payload.SubscriptionTypeDto;

@RestController
@RequestMapping("/type")
public class SubscriptionTypeController {
	@Autowired
	SubscriptionTypeService stService;
	
	@PostMapping
	public ResponseEntity<SubscriptionTypeDto> addSubscription(@RequestBody SubscriptionTypeDto stdto) {

		return new ResponseEntity<>(stService.addSubscription01(stdto), HttpStatus.CREATED);

	}
	@GetMapping("/getSubs")
	public ResponseEntity<List<SubscriptionType>> getAll() {

		return new ResponseEntity<List<SubscriptionType>>(stService.getAll(), HttpStatus.CREATED);

	}


	

}
