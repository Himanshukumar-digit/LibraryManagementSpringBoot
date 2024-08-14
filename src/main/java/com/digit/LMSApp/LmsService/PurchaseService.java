package com.digit.LMSApp.LmsService;

import java.util.List;

import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.PurchaseDto;

public interface PurchaseService {

	PurchaseDto purchasebook(int bid);

	PurchaseDto purchasebooks(int pid);

	String deletepurchasedBook(int pid);

	List<PurchaseDto> getAllPurchase();

	PurchaseDto updatePurchase(int id, PurchaseDto pdto);
	

}
