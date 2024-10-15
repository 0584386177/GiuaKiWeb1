package com.example.computer.repository;

import com.example.computer.model.Computers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computers, Long> {
}
