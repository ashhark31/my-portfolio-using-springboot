package com.mywebapp.demo.repo;

import org.springframework.data.repository.CrudRepository;
import com.mywebapp.demo.dao.WelcomePage;

public interface WelcomeRepo extends CrudRepository<WelcomePage, Integer>{

}
