package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.Client;
import com.francode.hotelBacked.persistence.generics.GenericRepository;

public interface JpaClientRepository extends GenericRepository<Client, Long> {
}
