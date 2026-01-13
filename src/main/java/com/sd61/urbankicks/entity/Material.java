package com.sd61.urbankicks.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "materials")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Material extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "code", nullable = false)
    private String code;

    @Nationalized
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "status", nullable = false)
    private Integer status;

}