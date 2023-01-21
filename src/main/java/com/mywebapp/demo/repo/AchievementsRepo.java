package com.mywebapp.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mywebapp.demo.dao.AchievementsPage;

public interface AchievementsRepo extends CrudRepository<AchievementsPage, Integer> {

}
