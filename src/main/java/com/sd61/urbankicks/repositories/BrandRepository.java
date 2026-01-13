package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BrandRepository extends JpaRepository<Brand, UUID> {
}