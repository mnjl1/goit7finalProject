package goit.springboot.project.controller;

import goit.springboot.project.model.Employee;
import goit.springboot.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeRestController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/employee")
    public Employee getEmployee(@RequestParam long id){
        return employeeRepository.findOne(id);
    }

//    @RequestMapping("/allemployees")
//    public List<Employee> getAllEmployees(){
//        return (List<Employee>) employeeRepository.findAll();
//    }
}
