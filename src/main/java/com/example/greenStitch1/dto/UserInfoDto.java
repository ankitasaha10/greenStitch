package com.example.greenStitch1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserInfoDto {

    private String name;
    private String email;
    private int age;
    private String address;
    private String gender;
}
