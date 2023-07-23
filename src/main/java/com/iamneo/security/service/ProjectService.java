package com.iamneo.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamneo.security.dto.response.ProjectsResponse;
import com.iamneo.security.dto.response.userSalaryResponse;
import com.iamneo.security.entity.Project;
import com.iamneo.security.entity.Salary;
import com.iamneo.security.repository.ProjectRepository;
import com.iamneo.security.repository.SalaryRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projRepo;
    public ProjectsResponse getUserProject(Long id) {
        Project userProj = projRepo.findById(id).get();
        var userProjectData =  ProjectsResponse.builder().project_lead(userProj.getProject_lead()).current_project(userProj.getCurrent_project()).deadline(userProj.getDeadline()).project_completion_percentage(userProj.getProject_completion_percentage()).build();
        return userProjectData;
    }
}
