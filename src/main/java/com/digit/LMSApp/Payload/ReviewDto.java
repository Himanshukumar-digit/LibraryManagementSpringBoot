package com.digit.LMSApp.Payload;

import lombok.Data;

@Data
public class ReviewDto {
	int rid;
	String comment;
	int uid;
	int bid;
	/**
	 * @param rid
	 * @param comment
	 * @param uid
	 * @param bid
	 */
	public ReviewDto(int rid, String comment, int uid, int bid) {
		super();
		this.rid = rid;
		this.comment = comment;
		this.uid = uid;
		this.bid = bid;
	}
	/**
	 * 
	 */
	public ReviewDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	

}
