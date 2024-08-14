package com.digit.LMSApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digit.LMSApp.Entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {

}
