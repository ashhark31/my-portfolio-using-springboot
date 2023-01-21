<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>     

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>MyPortfolio</title>
	<link rel="stylesheet" href="index.css">
</head>
<body>
<div class="main">
        <div class="welcomePage formargin">
            <div id="welcomeMessage">
                <span>
                    <em>
                        <i>${welcome.welcomeTitle}</i>
                        ${welcome.welcomeMessage}
                    </em>
                    <table>
                    	<tr>
							<th>frontend</th>
							<th>database</th>
							<th>backend</th>
							<th>tools</th>                    	
                    	</tr>
                    	<tr>
                    		<td>${welcome.frontEnd[0]}</td>
                    		<td>${welcome.database[0]}</td>
                    		<td>${welcome.backEnd[0]}</td>
                    		<td>${welcome.tools[0]}</td>
                    	</tr>
                    	<tr>
                    		<td>${welcome.frontEnd[1]}</td>
                    		<td></td>
                    		<td>${welcome.backEnd[1]}</td>
                    		<td>${welcome.tools[1]}</td>
                    	</tr>
                    	<tr>
                    		<td>${welcome.frontEnd[2]}</td>
                    		<td></td>
                    		<td>${welcome.backEnd[2]}</td>
                    		<td>${welcome.tools[2]}</td>
                    	</tr>
                    	<tr>
                    		<td></td>
                    		<td></td>
                    		<td>${welcome.backEnd[3]}</td>
                    		<td>${welcome.tools[3]}</td>
                    	</tr>
                    </table>
                </span>
            </div>
            <div id="image">
                <span>
                    <img src="img/my_img.JPG">
                </span>
            </div>
        </div>
        <div class="aboutPage formargin">
            <span class="sideHeading">
                <em>-aboutme</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    ${about.aboutMe}
                </em>
            </span>
        </div>
        <div class="educationPage formargin">
            <span class="sideHeading">
                <em>-graduation</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    ${education.college[0]} | ${education.college[1]} <br>
                    ${education.college[2]} | ${education.college[3]} <br>
                    ${education.college[4]} <br> 
                    ${education.college[5]}
                </em>
            </span>
            <span class="sideHeading">
                <em>-12th</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    ${education.school_sec[0]} | ${education.school_sec[1]} <br>
                    ${education.school_sec[2]} | ${education.school_sec[3]} <br>
                    ${education.school_sec[4]} <br> 
                    ${education.school_sec[5]}
                </em>
            </span>
            <span class="sideHeading">
                <em>-10th</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    <em>
                    ${education.school_high[0]} | ${education.school_high[1]} <br>
                    ${education.school_high[2]} | ${education.school_high[3]} <br>
                    ${education.school_high[4]} <br> 
                    ${education.school_high[5]}                  
                </em>
            </span>
        </div>
        <div class="experiencePage formargin">
            <span class="sideHeading">
                <em>-experience</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    ${experience.experience[0]} | ${experience.experience[1]} <br>
                    ${experience.experience[2]} | ${experience.experience[3]} <br>
                    ${experience.experience[4]} <br>
                    ${experience.experience[5]}
                </em>
            </span>
            <span class="bodyContent training">
                <i>${experience.training_key[0]}</i><br>
                ${experience.training_value[0]} <br>
                <i>${experience.training_key[1]}</i><br>
                ${experience.training_value[1]}
            </span>
        </div>
        <div class="skillsPage formargin">
            <span class="sideHeading">
                <em>-skills</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    <i>${skills.skills_key[0]}</i><br>
                    ${skills.skills_value[0]}<br>
                    <i>${skills.skills_key[1]}</i><br>
                    ${skills.skills_value[1]}<br>
                    <i>${skills.skills_key[2]}</i><br>
                    ${skills.skills_value[2]}<br>
                    <i>${skills.skills_key[3]}</i><br>
                    ${skills.skills_value[3]}
                </em>
            </span>
        </div>
        <div class="projectsPage formargin">
            <span class="sideHeading">
                <em>-projects</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    <i>${projects.project_one[0]} | ${projects.project_one[1]}<br>
                    ${projects.project_one[2]}</i>
                    <br><br>
                    ${projects.project_one[3]}<br>
                    ${projects.project_one[4]}
                </em>
            </span>
            <span class="bodyContent training">
                <em>
                    <i>${projects.project_two[0]} | ${projects.project_two[1]}<br>
                    ${projects.project_two[2]}</i>
                    <br><br>
                    ${projects.project_two[3]}<br>
                </em>
            </span>
            <span class="bodyContent training">
                <em>
                    <i>${projects.project_three[0]} | ${projects.project_three[1]}<br>
                    ${projects.project_three[2]}</i>
                    <br><br>
                    ${projects.project_three[3]}<br>
                    ${projects.project_three[4]}
                </em>
            </span>
            <span class="bodyContent training">
                <em>
                    <i>${projects.project_four[0]} | ${projects.project_four[1]}<br>
                    ${projects.project_four[2]}</i>
                    <br><br>
                    ${projects.project_four[3]}<br>
                    ${projects.project_four[4]}
                </em>
            </span>
        </div>
        <div class="achievementsPage formargin">
            <span class="sideHeading">
                <em>-achievements</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    ${achievements.achievements[0]} | ${achievements.achievements[1]}<br>
                    ${achievements.achievements[2]}
                </em>
            </span>
            <span class="bodyContent training">
                <em>
                    ${achievements.achievements[3]} | ${achievements.achievements[4]}<br>
                    ${achievements.achievements[5]}
                </em>
            </span>
        </div>
        <div class="contactPage formargin">
            <span class="sideHeading">
                <em>-contact</em>
                <hr>
            </span>
            <span class="bodyContent">
                <em>
                    <i>${contact.address_key[0]}</i><br>
                    ${contact.address_value[0]}
                </em>
            </span>
            <span class="bodyContent training">
                <em>
                    <i>${contact.address_key[0]}</i><br>
                    ${contact.address_value[1]}
                </em>
            </span>
            <span class="bodyContent training">
                <em>
                    <i>${contact.address_key[0]}</i><br>
                    ${contact.address_value[2]}
                </em>
            </span>
        </div>
    </div>
</body>
</html>