package goit.springboot.project.controller;

import goit.springboot.project.model.Position;
import goit.springboot.project.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PositionWebController {
    @Autowired
    PositionRepository positionRepository;

    @GetMapping("/positionform")
    public String positionForm(Model model){
        model.addAttribute("position", new Position());
        return "positionform";
    }

    @PostMapping("/positionform")
    public String positionSubmission(@ModelAttribute Position position, Model model){
        model.addAttribute("position", position);
        positionRepository.save(position);
        return "positionresult";
    }
}
