package com.digit.LMSApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digit.LMSApp.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
