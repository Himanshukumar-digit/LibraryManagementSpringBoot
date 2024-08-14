package com.digit.LMSApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.LMSApp.Entity.PurchaseBook;
import com.digit.LMSApp.Entity.User;
import com.digit.LMSApp.LmsService.UserService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService uservice;
	
	@PostMapping("add")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<>(uservice.addUser(user),HttpStatus.CREATED);
	}
	
	@PostMapping("buy/{bid}/{uid}")
	public ResponseEntity<String> buy(@PathVariable int bid,@PathVariable int uid) {
		return new ResponseEntity<String>(uservice.buy(bid,uid),HttpStatus.OK);
	}
	
	@GetMapping("viewBooks/{uid}")
	public ResponseEntity<List<PurchaseBook>> viewBook(@PathVariable int uid){
		return new ResponseEntity<>(uservice.viewBook(uid),HttpStatus.OK);
	}
	
	@PostMapping("buySubs/{stid}/{uid}")
	public ResponseEntity<String> buySubscription(@PathVariable int stid,@PathVariable int uid) {
		return new ResponseEntity<String>(uservice.buySubscription(stid,uid),HttpStatus.OK);
	}
	@DeleteMapping("deleteSubs/{subid}/{uid}")
	public ResponseEntity<String> DeleteSubscription(@PathVariable int subid,@PathVariable int uid) {
		return new ResponseEntity<String>(uservice.DeleteSubscription(subid,uid),HttpStatus.OK);
	}
	
	
}
