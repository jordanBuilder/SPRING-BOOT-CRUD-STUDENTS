/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */

/**
 * Service interface for Department entity.
 * Defines methods for CRUD operations and additional business logic.
 */

@Service
public interface StudentService {
    
     /**
     * Saves a student entity.
     * @param student the department to save
     * @return the saved department
     */
    
    Student saveStudent(Student student);
    
    
    /**
     * Fetches the list of all students entities.
     * @return a list of students
     */
    
    List<Student> fetchStudentList();
    
    /**
     * Updates an existing student entity.
     * @param student the department with updated information
     * @param studentId the ID of the student to update
     * @return the updated student
     */
    
    
    Student updateStudent(Student student,Long studentId);
    
    
    /**
     * Deletes a student entity by its ID.
     * @param studentId the ID of the student to delete
     */
    
    void deleteStudentById(Long studentId);
    
    
}
