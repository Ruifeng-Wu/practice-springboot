package com.practice.springboot.repository;

import com.practice.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Override
    List<Employee> findAll();

    @Override
    void deleteById(Long aLong);


}
