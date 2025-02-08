package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.Category;
import com.francode.hotelBacked.persistence.generics.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCategoryRepository extends GenericRepository<Category, Long> {
}
