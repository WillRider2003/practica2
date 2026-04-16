package com.example.practica.controller;

import com.example.practica.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public String listEmployees(@RequestParam(required = false) String keyword, Model model) {

        if (keyword != null && !keyword.isEmpty()) {
            model.addAttribute("employees", employeeRepository.findByFirstNameContainingOrLastNameContaining(keyword, keyword));
        } else {
            model.addAttribute("employees", employeeRepository.findAll());
        }

        model.addAttribute("keyword", keyword);

        return "employees";
    }
}