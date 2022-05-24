package com.tutorial.p1;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.tutorial.p2.College;

import ch.qos.logback.core.Context;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.tutorial.p1", "com.tutorial.p2" })
@ComponentScan(basePackages = {"com.tutorial.*"})
public class SpringBootResearchPoCsApplication {

	@Autowired
	private Student student;
	
	public void showStudentInfo()
	{
		student.showInfo();
	}
	public static void main(String[] args) {
		//SpringApplication.run(SpringBootResearchPoCsApplication.class, args);
		
		
		  ConfigurableApplicationContext
		  context=SpringApplication.run(SpringBootResearchPoCsApplication.class,args);
		  Student s1=context.getBean(Student.class); s1.displayInfo(); College
		  c1=context.getBean(College.class); s1.setAge(34); s1.setFname("Kunal");
		  s1.setLname("Sinha"); c1.setCollegeName("IIT"); c1.setStudentObj(s1);
		  System.out.println(c1);
		 
		  
		}

}
