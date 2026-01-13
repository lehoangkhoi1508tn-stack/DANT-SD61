package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SizeRepository extends JpaRepository<Size, UUID> {
}