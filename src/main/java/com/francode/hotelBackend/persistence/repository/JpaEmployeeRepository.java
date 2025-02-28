package com.francode.hotelBackend.persistence.repository;

import com.francode.hotelBackend.domain.entity.Employee;
import com.francode.hotelBackend.persistence.generics.GenericRepository;

public interface JpaEmployeeRepository extends GenericRepository<Employee, Long> {
}
