package com.example.cart.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "cart_items")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "cart_id")
    private UUID cartId;

    @Column(name = "product_variant_id")
    private UUID productVariantId;

    private Integer quantity;

    @Column(name = "unit_price")
    private Double unitPrice;

    @Transient // Tên SP tạm thời để hiển thị lên UI
    private String productName = "Giày UrbanKicks Edition";
}