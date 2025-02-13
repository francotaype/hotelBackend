package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaUserRepository extends JpaRepository<UserApp, Long> {
    boolean existsByEmail(String email);
    Optional<UserApp> findByEmail(String email);
}
