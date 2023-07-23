package com.iamneo.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamneo.security.dto.response.UsersDetailsResponse;
import com.iamneo.security.entity.UsersDetails;
import com.iamneo.security.repository.UsersDetailsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailService {
    private final UsersDetailsRepository userDetailsRepository;
    public UsersDetailsResponse getUserDetail(Long id) {
        UsersDetails userDetail = userDetailsRepository.findById(id).orElseThrow();

        var userData =  UsersDetailsResponse.builder().address(userDetail.getAddress()).age(userDetail.getAge()).email(userDetail.getEmail()).date_of_join(userDetail.getDate_of_join()).department(userDetail.getDepartment()).phone(userDetail.getPhone()).profile_url(userDetail.getProfile_url()).name(userDetail.getName()).build();
        return userData;
    }
    
}
