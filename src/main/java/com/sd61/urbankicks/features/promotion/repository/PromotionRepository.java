package com.sd61.urbankicks.features.promotion.repository;

import com.sd61.urbankicks.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PromotionRepository extends JpaRepository<Promotion, UUID> {
    boolean existsByCode(String code);
}
