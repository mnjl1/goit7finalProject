package goit.springboot.project.controller;

import goit.springboot.project.model.Employee;
import goit.springboot.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeWebController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employeeform", method = RequestMethod.GET)
    public String employeeForm(Model model){
        model.addAttribute("employee", new Employee());
        return "employeeform";
    }

    @RequestMapping(value = "/employeeform", method = RequestMethod.POST)
    public String employeeSubmit(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        employeeRepository.save(employee);
        return "employeeresult";
    }
}
