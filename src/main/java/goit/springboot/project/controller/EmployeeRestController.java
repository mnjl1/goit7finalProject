package goit.springboot.project.controller;

import goit.springboot.project.model.Employee;
import goit.springboot.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeRestController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/employee")
    public List<Employee> getEmployees(){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
        return employeeList;
    }
}
