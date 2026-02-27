package com.sd61.urbankicks.features.promotion.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class PromotionRequest {

    @NotBlank(message = "Code không được để trống")
    @Size(max = 100, message = "Code tối đa 100 ký tự")
    private String code;

    @NotBlank(message = "Tên tiếng Việt không được để trống")
    @Size(max = 255, message = "Tên tiếng Việt tối đa 255 ký tự")
    private String nameVi;

    @NotBlank(message = "Tên tiếng Anh không được để trống")
    @Size(max = 255, message = "Tên tiếng Anh tối đa 255 ký tự")
    private String nameEn;

    @Size(max = 500, message = "Mô tả tiếng Việt tối đa 500 ký tự")
    private String descriptionVi;

    @Size(max = 500, message = "Mô tả tiếng Anh tối đa 500 ký tự")
    private String descriptionEn;

    /**
     * 1 = PERCENT
     * 2 = FIXED_AMOUNT
     */
    @NotNull(message = "Loại giảm giá không được để trống")
    @Min(value = 1, message = "discountType không hợp lệ")
    @Max(value = 2, message = "discountType không hợp lệ")
    private Integer discountType;

    @NotNull(message = "Giá trị giảm không được để trống")
    @DecimalMin(value = "0.01", message = "Giá trị giảm phải > 0")
    @Positive
    private BigDecimal discountValue;

    @DecimalMin(value = "0.01", message = "Giá trị giảm tối đa phải > 0")
    @PositiveOrZero
    private BigDecimal maxDiscountValue;

    @NotNull(message = "Ngày bắt đầu không được để trống")
    private Instant startDate;

    @NotNull(message = "Ngày kết thúc không được để trống")
    private Instant endDate;

    /**
     * 1 = ACTIVE
     * 0 = INACTIVE
     */
    @NotNull(message = "Trạng thái không được để trống")
    @Min(value = 0)
    @Max(value = 1)
    private Integer status;
}
