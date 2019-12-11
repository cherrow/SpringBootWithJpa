package com.cherrow.jpa.repository;

import com.cherrow.jpa.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleJpaRepository extends JpaRepository<Role, Long> {
}
