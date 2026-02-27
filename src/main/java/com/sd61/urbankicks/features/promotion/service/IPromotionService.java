package com.sd61.urbankicks.features.promotion.service;

import com.sd61.urbankicks.entity.Promotion;
import com.sd61.urbankicks.features.promotion.dto.PromotionRequest;

import java.util.List;
import java.util.UUID;

public interface IPromotionService {

    Promotion create(PromotionRequest request);

    Promotion update(UUID id, PromotionRequest request);

    void delete(UUID id);

    Promotion getById(UUID id);

    List<Promotion> getAll();

    void assignProductVariant(UUID promotionId, UUID productVariantId);

    void assignMultipleProductVariants(
            UUID promotionId,
            List<UUID> productVariantIds
    );
}
