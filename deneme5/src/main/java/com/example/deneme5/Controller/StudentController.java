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
import com.example.deneme5.Service.StudentService;
import com.example.deneme5.dto.StudentRequest;
import com.example.deneme5.entity.Student;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    private List<Student> getAll(){
        return studentService.getAll();
    }
    @GetMapping("/{id}")
    private Student getById(@PathVariable int id){
        return studentService.getById(id);
    }
    @PostMapping
    private Student add(@RequestBody StudentRequest student){
        return studentService.add(student);
    }
    

    @PutMapping("/{id}")
    private Student update(@PathVariable int id,@RequestBody Student student){
        student.setStudentId(id);
        return studentService.Update(student);
    }
    @DeleteMapping("/{id}")
        private void delete(@PathVariable int id){
            studentService.deleteById(id);
        }
    }

    
    


