package com.tutorial.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.tutorial.p2.College;

@Component
@Configuration
public class Student {
	
	String fname;
	String lname;
	int age;
	
	
	public Student() {
		super();
		System.out.println("Student Object created...");
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayInfo()
	{
		System.out.println("This is my stident POJO..");
	}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
	@Autowired
	private College college;
	
	public void showInfo()
	{
		
		System.out.println("Inside the Student class");
		college.collegeShow();
	}
	

}
