package com.example.employesDC23.Repositories;

import com.example.employesDC23.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
}
