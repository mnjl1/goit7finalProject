package goit.springboot.project.controller;

import goit.springboot.project.model.Position;
import goit.springboot.project.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PositionRestController {

    @Autowired
    PositionRepository positionRepository;

    @GetMapping("/allpositions")
    public List<Position> getPosition(){
        return (List<Position>) positionRepository.findAll();
    }
}
