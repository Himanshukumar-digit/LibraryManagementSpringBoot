package com.digit.LMSApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class ReviewBook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int rid;
	String comment;
	@ManyToOne
	User user;
	@ManyToOne
	Book book;

	
	
	@Override
	public String toString() {
		return "ReviewBook [rid=" + rid + ", comment=" + comment + "]";
	}
	/**
	 * 
	 */
	public ReviewBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param rid
	 * @param comment
	 * @param rating
	 * @param bid
	 */
	public ReviewBook(int rid, String comment) {
		super();
		this.rid = rid;
		this.comment = comment;
	//	this.rating = rating;
		
	}
	
	
	

}
