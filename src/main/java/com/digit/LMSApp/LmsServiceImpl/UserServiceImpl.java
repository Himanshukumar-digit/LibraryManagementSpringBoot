package com.digit.LMSApp.LmsServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.LMSApp.Entity.Book;
import com.digit.LMSApp.Entity.PurchaseBook;
import com.digit.LMSApp.Entity.Subscription;
import com.digit.LMSApp.Entity.SubscriptionType;
import com.digit.LMSApp.Entity.User;
import com.digit.LMSApp.LmsService.UserService;
import com.digit.LMSApp.Repository.BookRepository;
import com.digit.LMSApp.Repository.SubscriptionRepository;
import com.digit.LMSApp.Repository.SubscriptionTypeRepository;
import com.digit.LMSApp.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository urepo;

	@Autowired
	BookRepository brepo;

	@Autowired
	SubscriptionRepository subsrepo;
	@Autowired
	SubscriptionTypeRepository strepo;

	@Override
	public User addUser(User user) {

		return urepo.save(user);
	}

	@Override
	public String buy(int id, int uid) {
		Book b = brepo.findById(id).get();

		PurchaseBook p = new PurchaseBook(0, b.getBid(), b.getBname(), b.getCost(), b.getAuthor());
		User user = urepo.findById(uid).get();

		List<PurchaseBook> purchasedBooks = user.getPurchasedBooks();
		purchasedBooks.add(p);
		user.setPurchasedBooks(purchasedBooks);
		urepo.save(user);
		return "Purchased";
	}

	@Override
	public List<PurchaseBook> viewBook(int uid) {

		return urepo.findById(uid).get().getPurchasedBooks();
	}

	@Override
	public String buySubscription(int sid, int uid) {

		SubscriptionType stype = strepo.findById(sid).get();
		User u = urepo.findById(uid).get();
		u.setSubscription(stype);
		List<User> user = stype.getUserlist();
		user.add(u);

		stype.setUserlist(user);
		SubscriptionType save = strepo.save(stype);

		System.out.println(save);
		return "Subscribed";
	}

	@Override
	public String DeleteSubscription(int subid, int uid) {
//		// TODO Auto-generated method stub
		
		User user = urepo.findById(uid).get();
//		SubscriptionType subscription = user.getSubscription();
		user.setSubscription(null);
		urepo.save(user);
		
//		SubscriptionType s = strepo.findById(subid).get();
//		List<User> ul = s.getUserlist();
//		for (User u : ul) {
//			if (u.getUid() == uid) {
//				ul.remove(u);
//				System.out.println(uid);
//				break;
//			}
//		}
//		s.setUserlist(ul);
//		strepo.deleteById(subid);
		
		
		

		return "Deleted Successfully";
	}

}
