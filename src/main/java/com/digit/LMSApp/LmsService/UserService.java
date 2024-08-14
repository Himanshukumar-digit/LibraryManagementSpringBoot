package com.digit.LMSApp.LmsService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digit.LMSApp.Entity.PurchaseBook;
import com.digit.LMSApp.Entity.User;

@Service
public interface UserService {

	User addUser(User user);

	String buy(int id,int uid);

	List<PurchaseBook> viewBook(int uid);

	String buySubscription(int sid, int uid);

	String DeleteSubscription(int subid, int uid);

}
