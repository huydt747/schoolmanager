package com.example.studentmanager.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "NVARCHAR(255)")
    private String name;
    private String email;
    private Integer age;
}