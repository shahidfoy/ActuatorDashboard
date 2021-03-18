package com.shahidfoy.employeemanager.server.repo;

import com.shahidfoy.employeemanager.server.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Optional<Employee> findEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
