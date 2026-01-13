package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MaterialRepository extends JpaRepository<Material, UUID> {
}