package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}