package com.kaushik.payroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaushik.payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
