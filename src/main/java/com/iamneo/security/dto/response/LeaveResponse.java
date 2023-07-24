package com.iamneo.security.dto.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor 
public class LeaveResponse {
    private int days_present;
    private String leave_req_status;  
}
