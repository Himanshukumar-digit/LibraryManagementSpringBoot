package com.digit.LMSApp.Payload;

public class BookDto {
	int bid;
	String bname;
	int cost;
	String author;

	/**
	 * @param bid
	 * @param bname
	 * @param cost
	 * @param author
	 */
	public BookDto(int bid, String bname, int cost, String author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.cost = cost;
		this.author = author;
	}

	/**
	 * 
	 */
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
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

}
