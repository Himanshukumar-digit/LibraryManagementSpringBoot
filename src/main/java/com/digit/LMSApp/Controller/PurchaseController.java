package com.digit.LMSApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.LMSApp.LmsService.PurchaseService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.PurchaseDto;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	@Autowired
	PurchaseService pService;

	@GetMapping("getById/{bid}")

	public ResponseEntity<PurchaseDto> purchasebook(@PathVariable int bid) {

		return new ResponseEntity<>(pService.purchasebook(bid), HttpStatus.CREATED);

	}

	@GetMapping("getBy/{pid}")

	public ResponseEntity<PurchaseDto> purchasebooks(@PathVariable int pid) {

		return new ResponseEntity<>(pService.purchasebooks(pid), HttpStatus.CREATED);

	}

	@DeleteMapping("deleteby/{pid}")
	public ResponseEntity<String> deletepurchasedBook(@PathVariable int pid) {
		return new ResponseEntity<>(pService.deletepurchasedBook(pid), HttpStatus.CREATED);

	}

	@GetMapping("getpbook")
	public ResponseEntity<List<PurchaseDto>> getAllPurchase() {

		return new ResponseEntity<>(pService.getAllPurchase(), HttpStatus.CREATED);

	}
	@PutMapping("update/{pid}")
	public ResponseEntity<PurchaseDto> updatePurchase(@PathVariable int pid, @RequestBody PurchaseDto pdto){

		return new ResponseEntity<>(pService.updatePurchase(pid,pdto),HttpStatus.CREATED);
 
		}

}
