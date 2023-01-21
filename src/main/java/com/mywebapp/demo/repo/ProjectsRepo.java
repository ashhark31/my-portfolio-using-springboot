package com.mywebapp.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mywebapp.demo.dao.ProjectsPage;

public interface ProjectsRepo extends CrudRepository<ProjectsPage, Integer> {

}
