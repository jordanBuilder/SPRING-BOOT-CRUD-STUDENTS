/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;
import com.example.demo.services.StudentServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lenovo
 */

/* @RestController combine @Controller et @ResponseBody ce qui signifie que
 toutes les méthodes renvoient des réponses directement au format JSON ou text mais pas des vues HTML*/
@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/save-student")
    public String saveStudent(@ModelAttribute("student") Student student) {
        System.out.println("Received student: " + student);
        studentService.saveStudent(student);
        return "redirect:/students/lists";
    }

    @GetMapping("/create-student")
    public String createStudent(Model model) {
        model.addAttribute("student", new Student());
        return "create_student";
    }

    /*Handles GET requests to fetch the list of all students*/
    @GetMapping("/lists")
    public String fetchStudentList(Model model) {
        List<Student> students = studentService.fetchStudentList();
        model.addAttribute("students",students); // Passer les étudiants au modèle
        return "list_students";
    }

    /*Handles PUT requests to fetch the list of all students*/
    @PutMapping("/{Id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("Id") Long studentId) {
        return (Student) studentService.updateStudent(student, studentId);
    }

    /*Handles GET requests to fetch the list of all students*/
    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId) {
        studentService.deleteStudentById(studentId);
        return "deleted Successfully";
    }

}
