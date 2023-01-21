package com.mywebapp.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mywebapp.demo.dao.ContactPage;

public interface ContactRepo extends CrudRepository<ContactPage, Integer> {

}
