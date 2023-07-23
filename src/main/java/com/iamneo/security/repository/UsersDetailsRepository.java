package com.iamneo.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iamneo.security.entity.UsersDetails;
@Repository
public interface UsersDetailsRepository extends JpaRepository<UsersDetails, Long> {
    
}
