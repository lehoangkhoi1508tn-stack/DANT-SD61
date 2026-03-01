package com.sd61.urbankicks.features.order.repositories;

import com.sd61.urbankicks.features.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}