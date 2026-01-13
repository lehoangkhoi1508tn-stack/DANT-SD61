package com.sd61.urbankicks.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Nationalized
    @Column(name = "content_vi", nullable = false)
    private String contentVi;

    @Nationalized
    @Column(name = "content_en", nullable = false)
    private String contentEn;

    @Column(name = "status", nullable = false)
    private Integer status;

    @ColumnDefault("sysdatetime()")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

}