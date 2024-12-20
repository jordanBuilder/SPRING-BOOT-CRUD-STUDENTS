/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repositories;

import com.example.demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lenovo
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
