package com.lucasdev.dscommerce.repository;

import com.lucasdev.dscommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
