package com.digit.LMSApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pbook")
public class PurchaseBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	int bid;
	String bname;
	int cost;
	String author;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param pid
	 * @param bid
	 * @param bname
	 * @param cost
	 * @param author
	 */
	public PurchaseBook(int pid, int bid, String bname, int cost, String author) {
		super();
		this.pid = pid;
		this.bid = bid;
		this.bname = bname;
		this.cost = cost;
		this.author = author;
	}

	/**
	 * 
	 */
	public PurchaseBook() {
		super();
		// TODO Auto-generated constructor stub
	}

}
