package com.mdits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdits.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
