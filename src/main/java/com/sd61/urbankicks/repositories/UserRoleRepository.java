package com.sd61.urbankicks.repositories;

import com.sd61.urbankicks.entity.UserRole;
import com.sd61.urbankicks.entity.UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleId> {
}