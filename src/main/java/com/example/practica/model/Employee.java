package com.example.practica.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "employees")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "job_title")
    private String jobTitle;
    private String department;
    private String city;
    private String phone;
    private String salary;
}
