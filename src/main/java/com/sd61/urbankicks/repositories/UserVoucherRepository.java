package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.UserVoucher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserVoucherRepository extends JpaRepository<UserVoucher, UUID> {
}