package com.mywebapp.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ExperiencePage {

	
	@Id
	private int expId;
	private String[] experience;
	private String[] training_key;
	private String[] training_value;
		
	public ExperiencePage() {
		
		String[] experience = {
			"Persistent Systems",
			"Software Engineer",
			"Pune, India",
			"Jan 2022 - Nov 2022",
			"Intern (trainee) + FTE",
			"6 mos + 3 mos (9 months exp.)"
		};
		
		String[] training_key = {
			"Technology Track",
			"Training On"
		};
		
		String[] training_value = {
			"Java Full Stack",
			"Git, SQL(Oracle), OOPS, Java, Maven, Spring,"
			+ " HTML, CSS, JavaScript, React.js"
		};
		
		setExpId(1);
		setExperience(experience);
		setTraining_key(training_key);
		setTraining_value(training_value);
	}
	
	public int getExpId() {
		return expId;
	}
	public void setExpId(int expId) {
		this.expId = expId;
	}
	public String[] getExperience() {
		return experience;
	}
	public void setExperience(String[] experience) {
		this.experience = experience;
	}
	public String[] getTraining_key() {
		return training_key;
	}
	public void setTraining_key(String[] training_key) {
		this.training_key = training_key;
	}
	public String[] getTraining_value() {
		return training_value;
	}
	public void setTraining_value(String[] training_value) {
		this.training_value = training_value;
	}
	
	
}
