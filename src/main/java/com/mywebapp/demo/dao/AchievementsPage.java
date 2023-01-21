package com.mywebapp.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AchievementsPage {

	@Id
	private int achieveId;
	private String[] achievements;
	
	public AchievementsPage() {
		
		String[] achievements = {
			"LeetCode", 
	        "2 star coder in problem solving", 
	        "https://leetcode.com/ashhark31", 
	        "HackerRank",
	        "4 star coder in problem solving",
	        "https://www.hackerrank.com/ashhark31"
		};
		
		setAchieveId(1);
		setAchievements(achievements);
	}
	
	public int getAchieveId() {
		return achieveId;
	}
	public void setAchieveId(int achieveId) {
		this.achieveId = achieveId;
	}
	public String[] getAchievements() {
		return achievements;
	}
	public void setAchievements(String[] achievements) {
		this.achievements = achievements;
	}
	
}
