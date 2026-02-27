 package com.sd61.urbankicks.features.promotion.repository;

import com.sd61.urbankicks.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VoucherRepository extends JpaRepository<Voucher, UUID> {
    boolean existsByCode(String code);
}