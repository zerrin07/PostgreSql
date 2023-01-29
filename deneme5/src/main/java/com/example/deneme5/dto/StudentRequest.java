package com.example.deneme5.dto;

import java.time.LocalDate;

import com.example.deneme5.entity.Department;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentRequest {
    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
    private int departmentId;


   
   
}
