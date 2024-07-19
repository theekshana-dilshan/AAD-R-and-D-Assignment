package com.example.studentsystem.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class StudentDTO implements Serializable {
    private String name;
    private String phone;
    private String email;
}
