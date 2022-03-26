package com.ecommerce.customerservice.repository;

import com.ecommerce.customerservice.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findById(Integer id);

}
