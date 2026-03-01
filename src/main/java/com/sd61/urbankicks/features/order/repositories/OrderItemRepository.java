package com.sd61.urbankicks.features.order.repositories;

import com.sd61.urbankicks.features.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {
}