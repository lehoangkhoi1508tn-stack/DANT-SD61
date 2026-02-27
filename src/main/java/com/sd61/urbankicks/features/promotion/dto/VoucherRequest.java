package com.sd61.urbankicks.features.promotion.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class VoucherRequest {

    @NotBlank(message = "Code không được để trống")
    @Size(max = 100)
    private String code;

    @NotBlank(message = "Tên tiếng Việt không được để trống")
    @Size(max = 255)
    private String nameVi;

    @NotBlank(message = "Tên tiếng Anh không được để trống")
    @Size(max = 255)
    private String nameEn;

    @Size(max = 500)
    private String descriptionVi;

    @Size(max = 500)
    private String descriptionEn;

    /**
     * 1 = PERCENT
     * 2 = FIXED
     */
    @NotNull(message = "Loại giảm giá không được để trống")
    @Min(1)
    @Max(2)
    private Integer discountType;

    @NotNull(message = "Giá trị giảm không được để trống")
    @DecimalMin(value = "0.01", message = "Giá trị giảm phải > 0")
    @Positive
    private BigDecimal discountValue;

    @DecimalMin(value = "0", message = "Giá trị đơn hàng tối thiểu >= 0")
    @PositiveOrZero
    private BigDecimal minOrderValue;

    @DecimalMin(value = "0.01", message = "Giảm tối đa phải > 0")
    private BigDecimal maxDiscountValue;

    @NotNull(message = "Số lượng voucher không được để trống")
    @Min(value = 1, message = "Số lượng phải >= 1")
    private Integer quantity;

    @NotNull(message = "Ngày bắt đầu không được để trống")
    private Instant startDate;

    @NotNull(message = "Ngày kết thúc không được để trống")
    private Instant endDate;

    /**
     * 1 = ACTIVE
     * 0 = INACTIVE
     */
    @NotNull(message = "Trạng thái không được để trống")
    @Min(0)
    @Max(1)
    private Integer status;
}
