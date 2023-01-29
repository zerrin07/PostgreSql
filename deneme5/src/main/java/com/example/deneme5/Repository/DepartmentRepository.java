package com.example.deneme5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.deneme5.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{
    
}
