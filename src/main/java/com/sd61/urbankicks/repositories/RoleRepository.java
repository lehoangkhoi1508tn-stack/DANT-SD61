package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}