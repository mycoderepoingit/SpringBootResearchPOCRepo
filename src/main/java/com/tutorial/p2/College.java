package com.tutorial.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.tutorial.p1.Student;

@Component
@Configuration
public class College {

	String collegeName;
	Student studentObj;

	public Student getStudentObj() {
		return studentObj;
	}

	public void setStudentObj(Student studentObj) {
		this.studentObj = studentObj;
	}

	public College() {
		super();
		System.out.println("College Object created.....");
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void collegeShow()
	{
		System.out.println("Inside the college class...");
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", studentObj=" + studentObj + "]";
	}

	
	
}
