package com.sd61.urbankicks.features.promotion.service.impl;

import com.sd61.urbankicks.entity.ProductVariant;
import com.sd61.urbankicks.entity.Promotion;
import com.sd61.urbankicks.entity.PromotionProductVariant;
import com.sd61.urbankicks.features.promotion.dto.PromotionRequest;
import com.sd61.urbankicks.features.promotion.repository.PromotionProductVariantRepository;
import com.sd61.urbankicks.features.promotion.repository.PromotionRepository;
import com.sd61.urbankicks.features.promotion.service.IPromotionService;
import com.sd61.urbankicks.repositories.ProductVariantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PromotionServiceImpl implements IPromotionService {

    private final PromotionRepository promotionRepository;
    private final PromotionProductVariantRepository ppvRepository;
    private final ProductVariantRepository productVariantRepository;

    @Override
    public Promotion create(PromotionRequest request) {

        if (promotionRepository.existsByCode(request.getCode())) {
            throw new RuntimeException("Promotion code already exists");
        }

        Promotion promotion = new Promotion();
        BeanUtils.copyProperties(request, promotion);

        return promotionRepository.save(promotion);
    }

    @Override
    public Promotion update(UUID id, PromotionRequest request) {

        Promotion promotion = promotionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Promotion not found"));

        BeanUtils.copyProperties(request, promotion);

        return promotionRepository.save(promotion);
    }

    @Override
    public void delete(UUID id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public Promotion getById(UUID id) {
        return promotionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Promotion not found"));
    }

    @Override
    public List<Promotion> getAll() {
        return promotionRepository.findAll();
    }

    @Override
    public void assignProductVariant(UUID promotionId, UUID productVariantId) {

        Promotion promotion = promotionRepository.findById(promotionId)
                .orElseThrow(() -> new RuntimeException("Promotion not found"));

        ProductVariant variant = productVariantRepository.findById(productVariantId)
                .orElseThrow(() -> new RuntimeException("Product variant not found"));

        if (ppvRepository.existsByPromotion_IdAndProductVariants_Id(
                promotionId, productVariantId)) {
            throw new RuntimeException("Product variant already assigned");
        }

        PromotionProductVariant ppv = new PromotionProductVariant();
        ppv.setPromotion(promotion);
        ppv.setProductVariants(variant);

        ppvRepository.save(ppv);
    }

    @Override
    public void assignMultipleProductVariants(
            UUID promotionId,
            List<UUID> productVariantIds) {

        for (UUID variantId : productVariantIds) {
            assignProductVariant(promotionId, variantId);
        }
    }

}
