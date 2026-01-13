package com.sd61.urbankicks.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "sizes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Size extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @Column(name = "size_value", nullable = false, precision = 4, scale = 1)
    private BigDecimal sizeValue;

    @Column(name = "size_system", nullable = false, length = 10)
    private String sizeSystem;

    @Column(name = "gender", length = 10)
    private String gender;

    @Nationalized
    @Column(name = "display_name_vi", nullable = false, length = 50)
    private String displayNameVi;

    @Nationalized
    @Column(name = "display_name_en", nullable = false, length = 50)
    private String displayNameEn;

    @ColumnDefault("0")
    @Column(name = "display_order", nullable = false)
    private Integer displayOrder;

    @Column(name = "status", nullable = false)
    private Integer status;

}