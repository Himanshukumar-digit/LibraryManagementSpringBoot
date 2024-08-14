package com.digit.LMSApp.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Subscribed")
public class Subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int subid;
	@SuppressWarnings("unused")
    float amount;
	/**
	 * @param subid
	 * @param amount
	 * @param cost
	 * @param months
	 * @param userlist
	 */
	public Subscription(int subid, float amount, int months, List<User> userlist) {
		super();
		this.subid = subid;
		this.amount = amount;
		
		this.months = months;
		this.userlist = userlist;
	}
	/**
	 * 
	 */
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public List<User> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	int months;
	@OneToMany
	List<User> userlist  = new ArrayList<>();
	

}
