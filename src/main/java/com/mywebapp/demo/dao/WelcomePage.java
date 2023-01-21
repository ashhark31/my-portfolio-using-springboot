package com.mywebapp.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class WelcomePage {

	@Id
	private int welcomeId;
	private String welcomeTitle;
	@Lob
	private String welcomeMessage;
	private String[] frontEnd;
	private String[] database;
	private String[] backEnd;
	private String[] tools;
	

	public WelcomePage() {
		
		String[] frontend  = {"HTML", "CSS", "JSP"};
		String[] database = {"H2(Jdbc)"};
		String[] backend  = {"Core Java", "SpringBoot", "Servlet", "Maven"};
		String[] tools = {"Postman", "Spring Tool Suite", "H2(Jdbc)", "VS Code"};
		
		setWelcomeId(1);
		setWelcomeTitle("Hello World !!!");
		setWelcomeMessage("welcome to my "
				+ "portfolio. This portfolio is done in Java Full Stack."
				+ " I wanted to learn Java Full Stack and "
				+ "I like project based learning."
				+ "Java Spring Boot is a tool that makes "
				+ "developing web application and microservices "
				+ "with Spring Framework. As below mentioned, I have also "
				+ "use H2(Jdbc), JSP for converting this project to full stack.");
		setFrontEnd(frontend);
		setDatabase(database);
		setBackEnd(backend);
		setTools(tools);
	}

	public int getWelcomeId() {
		return welcomeId;
	}
	
	public void setWelcomeId(int welcomeId) {
		this.welcomeId = welcomeId;
	}
	
	public String getWelcomeTitle() {
		return welcomeTitle;
	}
	public void setWelcomeTitle(String welcomeTitle) {
		this.welcomeTitle = welcomeTitle;
	}
	public String getWelcomeMessage() {
		return welcomeMessage;
	}
	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	public String[] getFrontEnd() {
		return frontEnd;
	}
	public void setFrontEnd(String[] frontEnd) {
		this.frontEnd = frontEnd;
	}
	public String[] getDatabase() {
		return database;
	}
	public void setDatabase(String[] database) {
		this.database = database;
	}
	public String[] getBackEnd() {
		return backEnd;
	}
	public void setBackEnd(String[] backEnd) {
		this.backEnd = backEnd;
	}
	public String[] getTools() {
		return tools;
	}
	public void setTools(String[] tools) {
		this.tools = tools;
	}
	
	
}
