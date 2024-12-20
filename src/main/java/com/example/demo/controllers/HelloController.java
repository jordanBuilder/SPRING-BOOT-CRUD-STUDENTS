package com.example.demo.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
@RestController
public class HelloController {
     @GetMapping("/")
    public String hello() {
        return "Hello GUYS";
    }
    @GetMapping("/hi")
    public String hi() {
        return "Hi Devs";
    }
    
      
}
