package com.example.companyemployee.repository;

import com.example.companyemployee.contralior.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    List<Employee>findAllByName(String name);
}
