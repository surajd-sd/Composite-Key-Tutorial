package com.composite.key.composite.repository;

import com.composite.key.composite.entity.Employee;
import com.composite.key.composite.entity.EmployeePkId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, EmployeePkId> {
}
