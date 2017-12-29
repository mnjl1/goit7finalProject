package goit.springboot.project.controller;

import goit.springboot.project.model.Employee;
import goit.springboot.project.model.Position;
import goit.springboot.project.repository.EmployeeRepository;
import goit.springboot.project.repository.PositionRepository;
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

    @RequestMapping(value = "/employeeform", method = RequestMethod.GET)
    public String employeeForm(Model model){
        model.addAttribute("employee", new Employee());
        model.addAttribute("position", new Position());
        return "employeeform";
    }

    @RequestMapping(value = "/employeeform", method = RequestMethod.POST)
    public String employeeSubmit(@ModelAttribute Employee employee, Model model){
        PositionRepository positionRepository = null;
        model.addAttribute("employee", employee);
        List<Position> positions = (List<Position>) positionRepository.findAll();
        employeeRepository.save(employee);
        return "employeeresult";
    }
}
