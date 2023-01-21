package com.mywebapp.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mywebapp.demo.dao.SkillsPage;

public interface SkillsRepo extends CrudRepository<SkillsPage, Integer> {

}
