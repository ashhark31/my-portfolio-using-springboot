package com.mywebapp.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SkillsPage {

	@Id
	private int skillsId;
	private String[] skills_key;
	private String[] skills_value;
	
	public SkillsPage() {
		
		String[] skills_key = {
			"Programming Language",
			"Technologies",
			"Full Stack",
			"Relevant Coursework",
			"Databases"
		};
		
		String[] skills_value = {
			"C/C++, Java, Python",
			"JavaScript, Jquery, TypeScript, Angular.js, "
			+ "React.js, Node.js, Express.js, SpringBoot, "
			+ "JSP, Servlet, Django",
			"MEAN, MERN, Java",
			"Data Structures and DBMS",
			"MySQL, Oracle"
		};
		
		setSkillsId(1);
		setSkills_key(skills_key);
		setSkills_value(skills_value);
	}
	
	public int getSkillsId() {
		return skillsId;
	}
	public void setSkillsId(int skillsId) {
		this.skillsId = skillsId;
	}
	public String[] getSkills_key() {
		return skills_key;
	}
	public void setSkills_key(String[] skills_key) {
		this.skills_key = skills_key;
	}
	public String[] getSkills_value() {
		return skills_value;
	}
	public void setSkills_value(String[] skills_value) {
		this.skills_value = skills_value;
	}
	
	
}
