package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TokenRepository extends JpaRepository<Token, UUID> {
}