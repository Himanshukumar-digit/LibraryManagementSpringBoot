package com.digit.LMSApp.Payload;

public class PurchaseDto {
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
	public PurchaseDto(int pid, int bid, String bname, int cost, String author) {
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
	public PurchaseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
