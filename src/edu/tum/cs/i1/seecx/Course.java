package edu.tum.cs.i1.seecx;


import java.util.List;
import java.util.Date;

public class Course{
	
	public String title;
	public Lecturer lecturer;
	public List<Date> dates;
	public List<Student> attendees;
	
	public Course(String title){
		this.title = title;
	}
	
	public void printCourseTitle() {
		
		System.out.println(this.title);
		
	}
}

// TODO: Implement Course Class