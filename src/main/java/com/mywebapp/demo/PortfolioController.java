package com.mywebapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mywebapp.demo.dao.AboutPage;
import com.mywebapp.demo.dao.AchievementsPage;
import com.mywebapp.demo.dao.ContactPage;
import com.mywebapp.demo.dao.EducationPage;
import com.mywebapp.demo.dao.ExperiencePage;
import com.mywebapp.demo.dao.ProjectsPage;
import com.mywebapp.demo.dao.SkillsPage;
import com.mywebapp.demo.dao.WelcomePage;
import com.mywebapp.demo.repo.AboutRepo;
import com.mywebapp.demo.repo.AchievementsRepo;
import com.mywebapp.demo.repo.ContactRepo;
import com.mywebapp.demo.repo.EducationRepo;
import com.mywebapp.demo.repo.ExperienceRepo;
import com.mywebapp.demo.repo.ProjectsRepo;
import com.mywebapp.demo.repo.SkillsRepo;
import com.mywebapp.demo.repo.WelcomeRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class PortfolioController {
	
	@Autowired
	WelcomeRepo welcomerepo;
	
	@Autowired
	AboutRepo aboutrepo;
	
	@Autowired
	EducationRepo educationrepo;
	
	@Autowired
	ExperienceRepo experiencerepo;
	
	@Autowired
	SkillsRepo skillsrepo;
	
	@Autowired
	ProjectsRepo projectsrepo;
	
	@Autowired
	AchievementsRepo achievementsrepo;
	
	@Autowired
	ContactRepo contactrepo;

	@RequestMapping("/")
	public String index(HttpSession session) {

		WelcomePage welcome = new WelcomePage();
		welcomerepo.save(welcome);
		
		AboutPage aboutpage = new AboutPage();
		aboutrepo.save(aboutpage);
		
		EducationPage educationpage = new EducationPage();
		educationrepo.save(educationpage);

		ExperiencePage experiencepage = new ExperiencePage();
		experiencerepo.save(experiencepage);
		
		SkillsPage skillspage = new SkillsPage();
		skillsrepo.save(skillspage);
		
		ProjectsPage projectspage = new ProjectsPage();
		projectsrepo.save(projectspage);
		
		AchievementsPage achievementspage = new AchievementsPage();
		achievementsrepo.save(achievementspage);
		
		ContactPage contactpage = new ContactPage();
		contactrepo.save(contactpage);
		
		session.setAttribute("welcome", welcome);
		session.setAttribute("about", aboutpage);
		session.setAttribute("education", educationpage);
		session.setAttribute("experience", experiencepage);
		session.setAttribute("skills", skillspage);
		session.setAttribute("projects", projectspage);
		session.setAttribute("achievements", achievementspage);
		session.setAttribute("contact", contactpage);
		
		System.out.println("working...");
		return "index.jsp";
	}
}
