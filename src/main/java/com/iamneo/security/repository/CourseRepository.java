package com.iamneo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Long> {
    
}
