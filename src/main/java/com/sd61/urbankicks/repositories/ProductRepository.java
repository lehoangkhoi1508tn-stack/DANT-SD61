package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}