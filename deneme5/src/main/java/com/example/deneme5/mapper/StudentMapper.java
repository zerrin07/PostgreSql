package com.example.deneme5.mapper;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.example.deneme5.Service.DepartmentService;
import com.example.deneme5.dto.StudentRequest;
import com.example.deneme5.entity.Department;
import com.example.deneme5.entity.Student;


@Component
public class StudentMapper { 
    private  final DepartmentService departmentService;
    public Student toStudent(StudentRequest studentRequest){
       
        Department department=departmentService.getById(studentRequest.getDepartmentId());
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setBirthDate(studentRequest.getBirthDate());
        student.setDepartment(department);     
        return student;
    }

    public StudentMapper(DepartmentService departmentService) {
        this.departmentService=departmentService;
    }

   
}
