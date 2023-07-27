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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.security.dto.response.userSalaryResponse;
import com.iamneo.security.entity.Salary;
import com.iamneo.security.repository.SalaryRepository;
import com.iamneo.security.service.UserSalaryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1/user")
public class SalaryController {
    private final SalaryRepository sal;
    private final UserSalaryService salServ;
    @PostMapping("/add/salary")
    public ResponseEntity<String> addSalary(@RequestBody Salary salary){
        sal.save(salary);
        return ResponseEntity.ok("Salary details added for "+ salary.getId());
    }
    @GetMapping("/get/salary/{id}")
    public ResponseEntity<userSalaryResponse> getSalary(@PathVariable("id") Long id){
        
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(salServ.getUserSalary(id));
    }
    @GetMapping("/get/salary")
    public List<Salary> getAllSalary(){
        return sal.findAll();
    }
}
