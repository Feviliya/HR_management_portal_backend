package com.iamneo.security.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectsResponse {
    private String current_project;
    private String deadline;
    private String project_lead;
    private int project_completion_percentage;
}
