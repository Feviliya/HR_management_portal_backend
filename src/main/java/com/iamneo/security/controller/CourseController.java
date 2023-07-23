package com.iamneo.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.security.dto.response.CourseResponse;
import com.iamneo.security.entity.Courses;
import com.iamneo.security.repository.CourseRepository;
import com.iamneo.security.service.CourseService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CourseController {
    private final CourseRepository courseRepo;
    private final CourseService courseSer;
    @PostMapping("/add/courses")
    public ResponseEntity<String> addCourse(@RequestBody Courses course){
        courseRepo.save(course);
        return ResponseEntity.ok("Course added");
    }
    @GetMapping("/get/course/{id}")
    public ResponseEntity<CourseResponse> getCourse(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(courseSer.getUserCourse(id));
    }
    @GetMapping("/get/allCourses")
    public List<Courses> getAllCourse(){
        return courseRepo.findAll();
    }
    @DeleteMapping("/delete/course/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("id") Long id){
		courseRepo.deleteById(id); 
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
}
