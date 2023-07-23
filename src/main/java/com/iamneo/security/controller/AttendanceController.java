package com.iamneo.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.security.dto.request.LeaveRequest;
import com.iamneo.security.dto.response.LeaveResponse;
import com.iamneo.security.entity.Attendance;
import com.iamneo.security.repository.AttendanceRepository;
import com.iamneo.security.service.LeaveService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/user")
public class AttendanceController {
    private final AttendanceRepository attrepo;
    
    @PostMapping("/post/attendance/{id}")
    public Attendance addLeave(@RequestBody Attendance at){
        return attrepo.save(at);
    }
    @GetMapping("/get/attendance/{id}")
    public ResponseEntity<Optional<Attendance>> getAttendance(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(attrepo.findById(id));
    }
    @GetMapping("/get/attendance")
    public List<Attendance> getAllAttendances(){
        return attrepo.findAll();
    }
    // @PutMapping("")
    // public Attendance updateAttendance(@RequestBody Attendance a){
    //     return attrepo.saveAndFlush(a);
    // }

}
