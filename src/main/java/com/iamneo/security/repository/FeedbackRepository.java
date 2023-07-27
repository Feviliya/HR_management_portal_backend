package com.iamneo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.Feed_user;

public interface  FeedbackRepository extends JpaRepository<Feed_user,Long> {
    
}
