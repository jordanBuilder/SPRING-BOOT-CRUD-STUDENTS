/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

/**
 *
 * @author Lenovo
 */
import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "students")


public class Student {
   @Id
   
   @GeneratedValue(strategy = GenerationType.IDENTITY)
 
   private Long Id;

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
   
 
   private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   

   private String lastName;
   

   private Integer age;
   

   private String phone;
    
   public Student() {
    }
}
