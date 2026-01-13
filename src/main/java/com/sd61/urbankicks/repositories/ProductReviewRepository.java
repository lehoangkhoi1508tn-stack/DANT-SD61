package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductReviewRepository extends JpaRepository<ProductReview, UUID> {
}