package com.example.practica.repository;

import com.example.practica.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

}