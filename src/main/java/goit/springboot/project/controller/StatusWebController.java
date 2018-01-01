package goit.springboot.project.controller;

import goit.springboot.project.model.Role;
import goit.springboot.project.model.Status;
import goit.springboot.project.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StatusWebController {
    @Autowired
    StatusRepository statusRepository;

    @GetMapping("/statusform")
    public String statusForm(Model model){
        model.addAttribute("status", new Status());
        return "statusform";
    }

    @PostMapping("/statusform")
    public String statusSubmission(@ModelAttribute Status status, Model model){
        model.addAttribute("status", status);
        statusRepository.save(status);
        return "statusresult";
    }
}
