package com.example.computer.repository;

import com.example.computer.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Các phương thức truy vấn tùy chỉnh nếu cần
}
