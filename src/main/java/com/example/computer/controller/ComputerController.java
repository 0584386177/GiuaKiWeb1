package com.example.computer.controller;

import com.example.computer.model.Computers;
import com.example.computer.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/computers")
public class ComputerController {
    @Autowired
    private ComputerService computerService;

    @GetMapping
    public List<Computers> getAllComputers() {
        return computerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computers> getComputerById(@PathVariable Long id) {
        Computers computer = computerService.findById(id);
        return computer != null ? ResponseEntity.ok(computer) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Computers createComputer(@RequestBody Computers computer) {
        return computerService.save(computer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComputer(@PathVariable Long id) {
        computerService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
