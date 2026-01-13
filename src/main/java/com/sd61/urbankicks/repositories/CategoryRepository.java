package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}