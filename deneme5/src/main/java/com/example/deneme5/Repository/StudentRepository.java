package com.example.deneme5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.deneme5.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    
}
