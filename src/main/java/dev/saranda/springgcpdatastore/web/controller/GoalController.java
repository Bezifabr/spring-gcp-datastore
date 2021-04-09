package dev.saranda.springgcpdatastore.web.controller;

import dev.saranda.springgcpdatastore.entity.Goal;
import dev.saranda.springgcpdatastore.repository.GoalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/goal")
public class GoalController {

    private final GoalRepository goalRepository;

    public GoalController(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    @GetMapping
    public Optional<Goal> getGoal(@RequestParam("id") String id){
        return goalRepository.findById(id);
    }

    @PostMapping
    public void addGoal(@RequestBody Goal goal){
        goalRepository.save(goal);
    }

}
