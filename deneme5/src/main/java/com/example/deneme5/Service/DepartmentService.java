package com.example.deneme5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deneme5.Repository.DepartmentRepository;
import com.example.deneme5.entity.Department;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public Department addOrUpdate(Department department){
        return departmentRepository.save(department);
    }
    public boolean deleteById(int id){
        departmentRepository.deleteById((id));
        return true;
    }
    public List<Department> getAll(){
        return departmentRepository.findAll();

    }
    public Department getById(int id){
        return departmentRepository.findById(id).orElseThrow(()-> new NullPointerException());
    }
    public Object save(Department newDepartment) {
        return null;
    }
    public Department saveOrUpdateADepartment(Department department) {
        return null;
    }
}
