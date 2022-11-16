package com.jwtsecurity.authentication.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwtsecurity.authentication.Entities.ERole;
import com.jwtsecurity.authentication.Entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
