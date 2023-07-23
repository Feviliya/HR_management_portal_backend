package com.iamneo.security.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersDetailsResponse {
    private String name;
    private String address; 
    private String email;
    private int age;
    private Long phone;
    private String date_of_join;
    private String department;
    private String profile_url;
}
