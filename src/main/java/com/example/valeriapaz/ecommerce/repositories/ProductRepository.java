package com.example.valeriapaz.ecommerce.repositories;

import com.example.valeriapaz.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
