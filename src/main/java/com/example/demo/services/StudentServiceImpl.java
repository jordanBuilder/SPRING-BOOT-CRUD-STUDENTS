/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.services.StudentService;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    
    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);  
    }

    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>) studentRepository.findAll();
    }
    
    
    @Override
    public Student updateStudent(Student student, Long studentId) {
        // Finds the existing student by ID.
        /*
        Student studId = studentRepository.findById(studentId).get();
        
        // Updates fields if they are not null or empty.
        
        if (Objects.nonNull(student.getFirstName()) && !"".equalsIgnoreCase(student.getFirstName())) {
            studId.setFirstName(student.getFirstName());
        }
        if (Objects.nonNull(student.getLastName()) && !"".equalsIgnoreCase(student.getLastName())) {
            studId.setLastName(student.getLastName());
        }
        if (Objects.nonNull(student.getAge()) && !"".equalsIgnoreCase(student.getAge())) {
            studId.setAge(student.getAge());
        }
        
        // Saves and returns the updated department entity.
        return studentRepository.save(studId);*/return null;
        // Finds the existing student by ID.
        /*
        Student studId = studentRepository.findById(studentId).get();
        
        // Updates fields if they are not null or empty.
        
        if (Objects.nonNull(student.getFirstName()) && !"".equalsIgnoreCase(student.getFirstName())) {
            studId.setFirstName(student.getFirstName());
        }
        if (Objects.nonNull(student.getLastName()) && !"".equalsIgnoreCase(student.getLastName())) {
            studId.setLastName(student.getLastName());
        }
        if (Objects.nonNull(student.getAge()) && !"".equalsIgnoreCase(student.getAge())) {
            studId.setAge(student.getAge());
        }
        
        // Saves and returns the updated department entity.
        return studentRepository.save(studId);*/
    }
    

    @Override
    public void deleteStudentById(Long studentId) {
           studentRepository.deleteById(studentId);

    }
}
