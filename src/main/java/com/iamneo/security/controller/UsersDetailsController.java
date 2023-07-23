package com.iamneo.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.security.dto.response.UsersDetailsResponse;
import com.iamneo.security.entity.Attendance;
import com.iamneo.security.entity.UsersDetails;
import com.iamneo.security.repository.UsersDetailsRepository;
import com.iamneo.security.service.UserDetailService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/user")
public class UsersDetailsController {
    private final UserDetailService  userServ;
    private final UsersDetailsRepository userDetailReposit;
    @PostMapping("/post/userDetails/{id}")
    public UsersDetails addUsersDetails(@RequestBody UsersDetails userDetail){
        return userDetailReposit.save(userDetail);
    }
    @GetMapping("/get/userDetails")
    public List<UsersDetails> getAllDetails(){
        return userDetailReposit.findAll();
    } 
    @GetMapping("/get/userDetails/{id}")
    public ResponseEntity<UsersDetailsResponse> getUserDetail(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userServ.getUserDetail(id));
    }
    @PutMapping("/update/userDetails")
	public ResponseEntity<UsersDetails> update(@RequestBody UsersDetails m) {
        UsersDetails uDetail=userDetailReposit.saveAndFlush(m);
		return ResponseEntity.ok(uDetail);
	}
}
