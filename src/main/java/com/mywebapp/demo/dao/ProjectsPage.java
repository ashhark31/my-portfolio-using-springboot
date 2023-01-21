package com.mywebapp.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProjectsPage {

	@Id
	private int projectId;
	private String[] project_one;
	private String[] project_two;
	private String[] project_three;
	private String[] project_four;
	
	public ProjectsPage() {
		
		String[] project_one = {
				"My-Portfolio",
				"https://my-portfolio-in-mern.cyclic.app",
				"https://my-portfolio-in-mean.cyclic.app",
				"-> I made this portfolio in 3 different technologies like MERN, MEAN and Java Full Stack.",
				"-> My aim was just to showcase my skillset and my hardwork. I can learn any technology according to the requirements."
		};
		
		String[] project_two = {
				"Chat App", 
		        "Node.js, Express.js, Socket.io, HTML, CSS", 
		        "http://mak-node-chat-app.herokuapp.com",
		        "-> It is a real time web chat application where two or more clients can send the information each others with the help of server.", 
		        "-> For example, there are 3 clients C1, C2, C3 and they want to talk to each other. So, first of they will enter their name and room name (e.g. chat-room), then they can talk to each other in the \"chat-room\"."
		};
		
		String[] project_three = {
				"Weather App", 
		        "Node.js, Express.js, HTML, CSS", 
		        "https://mak-weather.herokuapp.com", 		   
		        "-> For example, there are 3 clients C1, C2, C3 and they want to talk to each other. So, first of they will enter their name and room name (e.g. chat-room), then they can talk to each other in the \"chat-room\".", 

		};
		
		String[] project_four = {
				"Expenses List", 
		        "React.js, HTML, CSS", 
		        "https://mak-expenses-list.herokuapp.com", 
		        "-> It shows the expense graph and the expenses list where user can add his expense in expense list.", 
		        "-> In this project expense graph shows monthly and highest monthly user expenses."
		};
		
		setProjectId(1);
		setProject_one(project_one);
		setProject_two(project_two);
		setProject_three(project_three);
		setProject_four(project_four);
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String[] getProject_one() {
		return project_one;
	}
	public void setProject_one(String[] project_one) {
		this.project_one = project_one;
	}
	public String[] getProject_two() {
		return project_two;
	}
	public void setProject_two(String[] project_two) {
		this.project_two = project_two;
	}
	public String[] getProject_three() {
		return project_three;
	}
	public void setProject_three(String[] project_three) {
		this.project_three = project_three;
	}
	public String[] getProject_four() {
		return project_four;
	}
	public void setProject_four(String[] project_four) {
		this.project_four = project_four;
	}
}
