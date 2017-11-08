package com.mjm.springdatarest.employeeapi.repository;


import com.mjm.springdatarest.employeeapi.domain.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
