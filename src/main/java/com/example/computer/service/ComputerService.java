package com.example.computer.service;

import com.example.computer.model.Computers;
import com.example.computer.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {
    @Autowired
    private ComputerRepository computerRepository;

    public List<Computers> findAll() {
        return computerRepository.findAll();
    }

    public Computers findById(Long id) {
        return computerRepository.findById(id).orElse(null);
    }

    public Computers save(Computers computers) {
        return computerRepository.save(computers);
    }

    public void delete(Long id) {
        computerRepository.deleteById(id);
    }
}
