package com.sd61.urbankicks.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "code", nullable = false)
    private String code;

    @Nationalized
    @Column(name = "name_vi", nullable = false)
    private String nameVi;

    @Nationalized
    @Column(name = "name_en", nullable = false)
    private String nameEn;

    @Nationalized
    @Lob
    @Column(name = "description_vi")
    private String descriptionVi;

    @Nationalized
    @Lob
    @Column(name = "description_en")
    private String descriptionEn;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id")
    private Material material;

    @Column(name = "status", nullable = false)
    private Integer status;

}