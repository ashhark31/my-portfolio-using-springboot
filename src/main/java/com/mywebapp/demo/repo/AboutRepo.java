package com.mywebapp.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mywebapp.demo.dao.AboutPage;

public interface AboutRepo extends CrudRepository<AboutPage, Integer> {

}
