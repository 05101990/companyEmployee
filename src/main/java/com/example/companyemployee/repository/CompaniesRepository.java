package com.example.companyemployee.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompaniesRepository extends CrudRepository<Comparable,Integer> {

    List<Companies>findAllByName(String name);
}
