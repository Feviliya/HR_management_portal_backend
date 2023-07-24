package com.iamneo.security.service;

import org.springframework.stereotype.Service;

import com.iamneo.security.dto.request.LeaveRequest;
import com.iamneo.security.dto.response.LeaveResponse;
import com.iamneo.security.entity.Attendance;
import com.iamneo.security.repository.AttendanceRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class LeaveService {
    private final AttendanceRepository userAtt;
    public LeaveResponse getUserAttendance(Long id) {
        Attendance userAttend = userAtt.findById(id).orElseThrow();
        var userAttData =  LeaveResponse.builder().days_present(userAttend.getDays_present()).leave_req_status(userAttend.getLeave_req_status()).build();
        return userAttData;
    }
    public LeaveResponse getDaysPresent(LeaveRequest request) {
        var attData= Attendance.builder().id(request.getId()).leave_from_date(request.getLeave_from_date()).leave_to_date(request.getLeave_to_date()).reason(request.getReason()).leave_req_status(request.getLeave_req_status()).build();
        userAtt.save(attData);
        // var attData=userAtt.findById(request.getId()).orElseThrow();
        int days_pres = attData.getDays_present();
        return LeaveResponse.builder().days_present(days_pres).build();
    }
}
