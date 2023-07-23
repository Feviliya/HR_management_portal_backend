package com.iamneo.security.service;

import org.springframework.stereotype.Service;

import com.iamneo.security.dto.response.userSalaryResponse;
import com.iamneo.security.entity.Salary;
import com.iamneo.security.repository.SalaryRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserSalaryService {
    private final SalaryRepository userSalRepo;
    public userSalaryResponse getUserSalary(Long id) {
        Salary userSal = userSalRepo.findById(id).orElseThrow();
        var userSalData =  userSalaryResponse.builder().final_pay(userSal.getFinal_pay()).total_pay(userSal.getTotal_pay()).build();
        return userSalData;
    }
    
}