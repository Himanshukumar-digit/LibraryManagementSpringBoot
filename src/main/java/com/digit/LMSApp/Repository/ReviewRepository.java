package com.digit.LMSApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digit.LMSApp.Entity.ReviewBook;

public interface ReviewRepository extends JpaRepository<ReviewBook, Integer> {

}
