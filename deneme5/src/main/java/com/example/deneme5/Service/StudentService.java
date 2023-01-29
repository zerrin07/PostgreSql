package com.example.deneme5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deneme5.Repository.StudentRepository;
import com.example.deneme5.dto.StudentRequest;
import com.example.deneme5.entity.Student;
import com.example.deneme5.mapper.StudentMapper;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;
    

    public Student  add(StudentRequest student){
    
        return studentRepository.save(studentMapper.toStudent(student));
    }
    public boolean deleteById(int id){
        studentRepository.deleteById(id);
        return true;
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Student getById(int id){
        return studentRepository.findById(id).get();
    }
    public Student Update(Student student) {
        return null;
    }

}
