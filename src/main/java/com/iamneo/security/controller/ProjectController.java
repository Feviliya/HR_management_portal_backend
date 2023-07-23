package com.iamneo.security.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.iamneo.security.dto.response.ProjectsResponse;
import com.iamneo.security.entity.Project;
import com.iamneo.security.repository.ProjectRepository;
import com.iamneo.security.service.ProjectService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/user")
public class ProjectController {
    
    private final ProjectService projServ;
    private final ProjectRepository projRepo;
    @PostMapping("/add/projects")
    public ResponseEntity<String> addProjects(@RequestBody Project pro){
        projRepo.save(pro);
        return ResponseEntity.ok("Project added");
    }
    @GetMapping("/get/allProjects")
    public List<Project> showProjects(){
        return projRepo.findAll(); 
    }
    @GetMapping("/get/project/{id}")
    public ResponseEntity<ProjectsResponse> getProjects(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(projServ.getUserProject(id));
    }
    @DeleteMapping("/delete/project/{id}")
	public ResponseEntity<HttpStatus> deleteProject(@PathVariable("id") Long id){
		projRepo.deleteById(id);
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
    
}
