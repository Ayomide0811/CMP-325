package com.boostmytool.Gamestore.service;
import org.springframework.data.jpa.repository.JpaRepository;

import com.boostmytool.Gamestore.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
}
