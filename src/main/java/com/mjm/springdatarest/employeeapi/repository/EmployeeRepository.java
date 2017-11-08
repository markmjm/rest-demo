package com.mjm.springdatarest.employeeapi.repository;


import com.mjm.springdatarest.employeeapi.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
