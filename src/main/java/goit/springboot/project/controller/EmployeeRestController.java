package goit.springboot.project.controller;

import goit.springboot.project.model.Employee;
import goit.springboot.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeRestController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public Employee getEmployee(@RequestParam(value = "id") long id){
        return employeeRepository.findOne(id);
    }

    @RequestMapping("/employeelastname")
    public Iterable<Employee> getLastName(@RequestParam(value="name") String lastName) {
        return employeeRepository.findAll();
    }

//    @RequestMapping("/allemployees")
//    public List<Employee> getAllEmployees(){
//        return (List<Employee>) employeeRepository.findAll();
//    }
}
