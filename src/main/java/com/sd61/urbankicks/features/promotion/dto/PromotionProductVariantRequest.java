package com.sd61.urbankicks.features.promotion.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class PromotionProductVariantRequest {

    @NotNull(message = "promotionId không được để trống")
    private UUID promotionId;

    @NotEmpty(message = "Danh sách productVariantIds không được rỗng")
    private List<UUID> productVariantIds;
}
