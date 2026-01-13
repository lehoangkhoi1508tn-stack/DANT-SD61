package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {
}