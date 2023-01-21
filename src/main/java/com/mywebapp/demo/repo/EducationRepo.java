package com.mywebapp.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mywebapp.demo.dao.EducationPage;

public interface EducationRepo extends CrudRepository<EducationPage, Integer> {

}
