package com.example.deneme5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.deneme5.Service.DepartmentService;
import com.example.deneme5.entity.Department;


@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping
    private List<Department> getAll(){
        return departmentService.getAll();
    }
    @GetMapping("/{id}")
    private Department getById(@PathVariable int id){
        return departmentService.getById(id);
    }
    @PostMapping
    private Department add(@RequestBody Department department){
        return departmentService.addOrUpdate(department);
  
    }
    @PutMapping("/{id}")
    private Department update(@PathVariable int id,@RequestBody Department department){
        department.setDepartmentId(id);
        return departmentService.addOrUpdate(department);
    }
    @DeleteMapping("/{id}")
        private void delete(@PathVariable int id){
            departmentService.deleteById(id);
        }
    }

    
