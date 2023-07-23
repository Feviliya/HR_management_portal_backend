package com.iamneo.security.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.iamneo.security.dto.request.LeaveRequest;
import com.iamneo.security.dto.response.LeaveResponse;
import com.iamneo.security.entity.Attendance;
import com.iamneo.security.repository.AttendanceRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class LeaveService {
    // private final AttendanceRepository attRepo;
    // private final Attendance att;
    // public LeaveResponse request(@RequestBody LeaveRequest request,Long id){
    //     var leave=attRepo.findById(id).orElseThrow();
    //     attRepo.save(leave);
    //     return LeaveResponse.builder().leave_from_date(att.getLeave_from_date()).leave_to_date(att.getLeave_to_date()).reason(att.getReason()).build();
    // }
    
}
