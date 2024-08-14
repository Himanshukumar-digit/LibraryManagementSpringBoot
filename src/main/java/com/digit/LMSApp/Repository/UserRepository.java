package com.digit.LMSApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digit.LMSApp.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
