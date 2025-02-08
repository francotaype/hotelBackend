package com.francode.hotelBacked.persistence.repository;

import com.francode.hotelBacked.domain.entity.Employee;
import com.francode.hotelBacked.persistence.generics.GenericRepository;

public interface JpaEmployeeRepository extends GenericRepository<Employee, Long> {
}
