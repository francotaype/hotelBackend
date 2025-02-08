package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.RoomType;
import com.francode.hotelBacked.persistence.generics.GenericRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaRoomTypeRepository extends GenericRepository<RoomType, Long> {
}
