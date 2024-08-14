package com.digit.LMSApp.Payload;

import java.util.ArrayList;
import java.util.List;

import com.digit.LMSApp.Entity.User;

import jakarta.persistence.OneToMany;

public class SubscriptionTypeDto {
	int sid;
	String stype;
	int months;
	int scost;
	
	/**
	 * 
	 */
	public SubscriptionTypeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param sid
	 * @param stype
	 * @param months
	 * @param scost
	 * @param userlist
	 */
	public SubscriptionTypeDto(int sid, String stype, int months, int scost, List<User> userlist) {
		super();
		this.sid = sid;
		this.stype = stype;
		this.months = months;
		this.scost = scost;
		this.userlist = userlist;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getScost() {
		return scost;
	}

	public void setScost(int scost) {
		this.scost = scost;
	}

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	List<User> userlist  = new ArrayList<>();
	

}
