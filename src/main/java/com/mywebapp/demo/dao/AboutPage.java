package com.mywebapp.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class AboutPage {

	@Id
	private int aboutId;
	private String myName;
	@Lob
	private String aboutMe;
	@Lob
	private String myCareer;
	
	
	public AboutPage() {
		setAboutId(1);
		setMyName("Mohammad Ashhar Khan");
		setAboutMe("I am a Full Stack Developer and a Programmer. "
				+ "I live in Jabalpur (M.P.). I have completed my "
				+ "Bachelor’s degree at SRIT college (Jabalpur, M.P. ) "
				+ "in Computer Science and Engineering with an aggregate "
				+ "of 8.32. I have also completed Higher and Secondary "
				+ "education with the percentage of 70.5 and 62 respectively. "
				+ "I have some achievements on problem solving in Leet Code "
				+ "and HackerRank. I like full stack (end-to-end) development,"
				+ " I have worked with various personal projects, for in "
				+ "detail, please go to the Projects section. For polishing "
				+ "problem solving skills, currently, I am learning advanced "
				+ "topics of Data Structures and Algorithms.");
		setMyCareer("I am a Ex - Software Engineer at Persistent "
				+ "Systems. I worked here as an Intern and a FTE. "
				+ "They provide one of the best training IT company. "
				+ "I have learned a lot in this organisation. But, "
				+ "I have resigned for some reasons and looking for "
				+ "next opportunity. If you are a recruiter then kindly "
				+ "consider me in your organisation.");
	}
	
	public int getAboutId() {
		return aboutId;
	}
	public void setAboutId(int aboutId) {
		this.aboutId = aboutId;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public String getMyCareer() {
		return myCareer;
	}
	public void setMyCareer(String myCareer) {
		this.myCareer = myCareer;
	}
	
	
}
