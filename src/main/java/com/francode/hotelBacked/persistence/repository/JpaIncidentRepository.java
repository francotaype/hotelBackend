package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.Incident;
import com.francode.hotelBacked.persistence.generics.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaIncidentRepository extends GenericRepository<Incident, Long> {
}
