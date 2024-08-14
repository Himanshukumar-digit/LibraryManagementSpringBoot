package com.digit.LMSApp.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Book")
@Data
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bid;
	
	String bname;
	int cost;
	String author;

	@OneToMany(mappedBy="book")
	private List<ReviewBook> reviewBook;
	/**
	 * @param bid
	 * @param bname
	 * @param cost
	 * @param author
	 */
	public Book(int bid, String bname, int cost, String author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.cost = cost;
		this.author = author;
	}

	/**
	 * 
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
