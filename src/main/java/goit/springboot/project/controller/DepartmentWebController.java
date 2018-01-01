package goit.springboot.project.controller;

import goit.springboot.project.model.Department;
import goit.springboot.project.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DepartmentWebController {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping("/departmentform")
    public String departmentForm(Model model){
        model.addAttribute("department", new Department());
        return "departmentform";
    }

    @PostMapping("departmentform")
    public String departmentSubmission(@ModelAttribute Department department, Model model){
        model.addAttribute("department", department);
        departmentRepository.save(department);
        return "departmentresult";
    }
}
