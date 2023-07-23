package com.iamneo.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name="_attendance")
public class Attendance {
    @Id
    private Long id;
    private int days_present;
    private String leave_from_date;
    private String leave_to_date;
    private String reason;
    private String leave_req_status;  
}
