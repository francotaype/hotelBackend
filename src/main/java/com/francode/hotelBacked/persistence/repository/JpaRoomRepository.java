package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.Room;
import com.francode.hotelBacked.persistence.generics.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRoomRepository extends GenericRepository<Room, Long> {
}
