package com.bac.itformation.controller;

import com.bac.itformation.model.Formation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
@CrossOrigin
public class FormationController {

    private final FormationController formationService;

    public FormationController(FormationController formationService) {
        this.formationService = formationService;
    }

    @GetMapping("/all")
    public List<Formation> findAll() {
        return formationService.findAll();
    }

    @GetMapping("/{id}")
    public Formation findById(@PathVariable Long id) {
        return formationService.findById(id);
    }

    @PostMapping("/add")
    public Formation save(@RequestBody Formation formation) {
        return formationService.save(formation);
    }

    @DeleteMapping("/delete/all")
    public void deleteAll() {
        formationService.deleteAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        formationService.deleteById(id);
    }

    @PatchMapping("/update")
    public Formation update(@RequestBody Formation formation) {
        return formationService.update(formation);
    }
}
