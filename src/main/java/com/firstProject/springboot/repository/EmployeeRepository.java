package com.firstProject.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstProject.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
