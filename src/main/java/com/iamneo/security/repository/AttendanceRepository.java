package com.iamneo.security.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}

