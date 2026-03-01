package com.example.cart.entity;



import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "order_code", unique = true)
    private String orderCode;

    @Column(name = "receiver_name")
    private String receiverName;

    private String phone;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "order_type")
    private Integer orderType = 1;

    private Integer status = 1;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}
