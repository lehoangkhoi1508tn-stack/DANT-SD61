package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ColorRepository extends JpaRepository<Color, UUID> {
}