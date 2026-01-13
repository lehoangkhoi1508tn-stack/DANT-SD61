package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}