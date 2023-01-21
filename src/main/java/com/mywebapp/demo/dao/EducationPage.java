package com.mywebapp.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EducationPage {

	@Id
	private int eduId;
	private String[] college;
	private String[] school_sec;
	private String[] school_high;
	
	public EducationPage() {
		
		String[] college = {
			"Shri Ram Institute of Technology",
			"B.Tech",
			"Jabalpur, M.P.",
			"2018-2022",
			"Computer Science and Engineering",
			"8.32 GPA"
		};
		
		String[] school_sec = {
			"Maharashtra Higher Secondary School",
			"HSSC",
			"Jabalpur, M.P.",
			"2017-2018",
			"PCM",
			"62%"
		};
		
		String[] school_high = {
			"Maharashtra Higher Secondary School",
			"HSC",
			"Jabalpur, M.P.",
			"2015-2016",
			"General",
			"70.50%"
		};
		
		setEduId(1);
		setCollege(college);
		setSchool_sec(school_sec);
		setSchool_high(school_high);
	}
	
	public int getEduId() {
		return eduId;
	}
	public void setEduId(int eduId) {
		this.eduId = eduId;
	}
	public String[] getCollege() {
		return college;
	}
	public void setCollege(String[] college) {
		this.college = college;
	}
	public String[] getSchool_sec() {
		return school_sec;
	}
	public void setSchool_sec(String[] school_sec) {
		this.school_sec = school_sec;
	}
	public String[] getSchool_high() {
		return school_high;
	}
	public void setSchool_high(String[] school_high) {
		this.school_high = school_high;
	}
	
}
