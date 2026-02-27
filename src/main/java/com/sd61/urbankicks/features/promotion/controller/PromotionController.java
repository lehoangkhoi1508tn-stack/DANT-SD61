package com.sd61.urbankicks.features.promotion.controller;

import com.sd61.urbankicks.entity.Promotion;
import com.sd61.urbankicks.features.promotion.dto.PromotionProductVariantRequest;
import com.sd61.urbankicks.features.promotion.dto.PromotionRequest;
import com.sd61.urbankicks.features.promotion.service.IPromotionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/promotions")
@RequiredArgsConstructor
public class PromotionController {

    private final IPromotionService promotionService;

    // CRUD Promotion
    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody PromotionRequest request) {
        Promotion promotion = promotionService.create(request);
        return ResponseEntity.ok(promotion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(
            @PathVariable UUID id,
            @RequestBody PromotionRequest request) {

        return ResponseEntity.ok(
                promotionService.update(id, request)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        promotionService.delete(id);
        return ResponseEntity.ok("Deleted successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(
                promotionService.getById(id)
        );
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(
                promotionService.getAll()
        );
    }

    // Gán 1 product variant
    @PostMapping("/{promotionId}/product-variants/{variantId}")
    public ResponseEntity<?> assignProductVariant(
            @PathVariable UUID promotionId,
            @PathVariable UUID variantId) {

        promotionService.assignProductVariant(promotionId, variantId);
        return ResponseEntity.ok("Assigned successfully");
    }

    // Gán nhiều product variant
    @PostMapping("/assign-product-variants")
    public ResponseEntity<?> assignMultiple(
            @RequestBody PromotionProductVariantRequest request) {

        promotionService.assignMultipleProductVariants(
                request.getPromotionId(),
                request.getProductVariantIds()
        );

        return ResponseEntity.ok("Assigned multiple variants successfully");
    }
}

