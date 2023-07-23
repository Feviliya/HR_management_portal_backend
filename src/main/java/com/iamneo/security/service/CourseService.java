package com.iamneo.security.service;

import org.springframework.stereotype.Service;

import com.iamneo.security.dto.response.CourseResponse;
import com.iamneo.security.entity.Courses;
import com.iamneo.security.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepo;
    public CourseResponse getUserCourse(Long id) {
        Courses userCourse = courseRepo.findById(id).get();
        var userCourseData =  CourseResponse.builder().current_course(userCourse.getCurrent_course()).completion_status(userCourse.getCompletion_status()).courses_completed(userCourse.getCourses_completed()).current_course_desc(userCourse.getCurrent_course_desc()).build();
        return userCourseData;
    }
}
