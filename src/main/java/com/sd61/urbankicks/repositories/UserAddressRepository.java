package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserAddressRepository extends JpaRepository<UserAddress, UUID> {
}