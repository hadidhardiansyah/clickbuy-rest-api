package com.hadid.clickbuy.restapi.repository;

import com.hadid.clickbuy.restapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String role);

}
