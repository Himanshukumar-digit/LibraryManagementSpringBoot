package com.digit.LMSApp.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class SubscriptionType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sid;
	String stype;
	int months;
	int scost;
	@OneToMany(mappedBy="subscription",cascade = CascadeType.ALL)
	private List<User> userlist;
	
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
	/**
	 * @param sid
	 * @param stype
	 * @param months
	 * @param scost
	 * @param userlist
	 */
	public SubscriptionType(int sid, String stype, int months, int scost, List<User> userlist) {
		super();
		this.sid = sid;
		this.stype = stype;
		this.months = months;
		this.scost = scost;
		this.userlist = userlist;
	}
	/**
	 * 
	 */
	public SubscriptionType() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
