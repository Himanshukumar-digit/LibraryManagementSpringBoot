package com.digit.LMSApp.Payload;

import java.util.ArrayList;
import java.util.List;

import com.digit.LMSApp.Entity.User;

public class SubscriptionDto {
	int subid;
	
	float amount;
	
	int months;
	List<User> userlist  = new ArrayList<>();
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
	/**
	 * @param subid
	 * @param amount
	 * @param months
	 * @param userlist
	 */
	public SubscriptionDto(int subid, float amount, int months, List<User> userlist) {
		super();
		this.subid = subid;
		this.amount = amount;
		this.months = months;
		this.userlist = userlist;
	}
	/**
	 * 
	 */
	public SubscriptionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
		

}
