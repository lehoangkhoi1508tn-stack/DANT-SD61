package com.sd61.urbankicks.features.promotion.repository;

import com.sd61.urbankicks.entity.PromotionProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PromotionProductVariantRepository extends JpaRepository<PromotionProductVariant, UUID> {
    boolean existsByPromotion_IdAndProductVariants_Id(
            UUID promotionId,
            UUID productVariantId
    );
    List<PromotionProductVariant> findByPromotion_Id(UUID promotionId);
}
