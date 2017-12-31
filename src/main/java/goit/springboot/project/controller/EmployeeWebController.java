package goit.springboot.project.controller;

import goit.springboot.project.model.Employee;
import goit.springboot.project.model.Position;
import goit.springboot.project.model.Role;
import goit.springboot.project.repository.EmployeeRepository;
import goit.springboot.project.repository.PositionRepository;
import goit.springboot.project.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.ListIterator;

@Controller
public class EmployeeWebController {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PositionRepository positionRepository;

    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(value = "/employeeform", method = RequestMethod.GET)
    public String employeeForm(Model model){
        model.addAttribute("employee", new Employee());
        List<Position> positions = (List<Position>) positionRepository.findAll();
        model.addAttribute("positions", positions);
        List<Role> roles = (List<Role>) roleRepository.findAll();
        model.addAttribute("roles", roles);

        return "employeeform";
    }

    @RequestMapping(value = "/employeeform", method = RequestMethod.POST)
    public String employeeSubmit(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        employeeRepository.save(employee);
        return "employeeresult";
    }
}
