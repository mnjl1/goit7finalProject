package goit.springboot.project.controller;

import goit.springboot.project.model.Event;
import goit.springboot.project.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventWebController {
    @Autowired
    EventRepository eventRepository;

    @GetMapping("/eventform")
    public String eventForm(Model model){
        model.addAttribute("event", new Event());
        return "eventform";
    }

    @PostMapping("/eventform")
    public String eventSubmission(@ModelAttribute Event event, Model model){
        model.addAttribute("event", model);
        eventRepository.save(event);
        return "eventresult";
    }
}
