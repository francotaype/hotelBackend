package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.Reservation;
import com.francode.hotelBacked.persistence.generics.GenericRepository;

public interface JpaReservationRepository extends GenericRepository<Reservation, Long> {
}
