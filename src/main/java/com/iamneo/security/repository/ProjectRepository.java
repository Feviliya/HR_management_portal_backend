package com.iamneo.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}

