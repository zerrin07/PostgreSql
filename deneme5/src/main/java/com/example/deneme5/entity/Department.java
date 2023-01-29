package com.example.deneme5.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int departmentId;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="department_id", referencedColumnName="departmentId")
    private List<Student> students;

    
    
}
