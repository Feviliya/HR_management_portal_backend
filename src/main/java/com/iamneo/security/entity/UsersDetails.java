package com.iamneo.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="_user_details")
public class UsersDetails {
    @Id
    private Long id;
    private String name;
    private String address;
    private String email;
    private int age;
    private String department;
    private Long phone;
    private String date_of_join; 
    private String profile_url;
    private User user;
}
 