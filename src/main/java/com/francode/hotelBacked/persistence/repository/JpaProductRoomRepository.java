package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.ProductRoom;
import com.francode.hotelBacked.persistence.generics.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRoomRepository extends GenericRepository<ProductRoom, Long> {
}
