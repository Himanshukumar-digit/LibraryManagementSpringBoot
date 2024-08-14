package com.digit.LMSApp.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int uid;

	String uname;

	@ManyToOne(cascade = CascadeType.ALL)
	SubscriptionType subscription;
	@OneToMany(cascade = CascadeType.ALL)
	List<PurchaseBook> purchasedBooks;
	
	@OneToMany(mappedBy="user")
	private List<ReviewBook> reviewBook;
	
      
	
	/**
	 * @param uid
	 * @param uname
	 * @param subscription
	 * @param purchasedBooks
	 */
	public User(int uid, String uname, SubscriptionType subscription, List<PurchaseBook> purchasedBooks) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.subscription = subscription;
		this.purchasedBooks = purchasedBooks;
	}

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
