package com.mywebapp.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mywebapp.demo.dao.ExperiencePage;

public interface ExperienceRepo extends CrudRepository<ExperiencePage, Integer> {

}
