package goit.springboot.project.controller;

import goit.springboot.project.model.Role;
import goit.springboot.project.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoleWebController {
    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/roleform")
    public String roleForm(Model model){
        model.addAttribute("role", new Role());
        return "roleform";
    }

    @PostMapping("/roleform")
    public String roleSubmission(@ModelAttribute Role role, Model model){
        model.addAttribute("role", role);
        roleRepository.save(role);
        return "roleresult";
    }
}
