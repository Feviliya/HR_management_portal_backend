package com.iamneo.security.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {
    private int courses_completed;
    private int completion_status;
    private String current_course;
    private String current_course_desc;
}
