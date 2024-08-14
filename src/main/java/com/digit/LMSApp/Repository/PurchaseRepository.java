package com.digit.LMSApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digit.LMSApp.Entity.PurchaseBook;

public interface PurchaseRepository extends JpaRepository<PurchaseBook, Integer> {

}
