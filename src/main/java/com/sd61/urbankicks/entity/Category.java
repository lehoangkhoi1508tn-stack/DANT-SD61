package com.sd61.urbankicks.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "categories")
public class Category extends BaseEntity {
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

    @Column(name = "status", nullable = false)
    private Integer status;

}