package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.Company;
import com.francode.hotelBacked.persistence.generics.GenericRepository;

public interface JpaCompanyRepository extends GenericRepository<Company, Long> {
}
