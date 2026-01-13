package com.sd61.urbankicks.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "vouchers")
@RequiredArgsConstructor
@NoArgsConstructor
public class Voucher extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "code", nullable = false, length = 100)
    private String code;

    @Nationalized
    @Column(name = "name_vi", nullable = false)
    private String nameVi;

    @Nationalized
    @Column(name = "name_en", nullable = false)
    private String nameEn;

    @Nationalized
    @Column(name = "description_vi", length = 500)
    private String descriptionVi;

    @Nationalized
    @Column(name = "description_en", length = 500)
    private String descriptionEn;

    @Column(name = "discount_type", nullable = false)
    private Integer discountType;

    @Column(name = "discount_value", nullable = false, precision = 18, scale = 2)
    private BigDecimal discountValue;

    @ColumnDefault("0")
    @Column(name = "min_order_value", precision = 18, scale = 2)
    private BigDecimal minOrderValue;

    @Column(name = "max_discount_value", precision = 18, scale = 2)
    private BigDecimal maxDiscountValue;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @ColumnDefault("0")
    @Column(name = "used_quantity")
    private Integer usedQuantity;

    @Column(name = "start_date", nullable = false)
    private Instant startDate;

    @Column(name = "end_date", nullable = false)
    private Instant endDate;

    @Column(name = "status", nullable = false)
    private Integer status;

}