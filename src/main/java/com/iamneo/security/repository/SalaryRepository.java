package com.iamneo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iamneo.security.entity.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
    
}
