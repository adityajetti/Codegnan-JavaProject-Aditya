package com.codegnan.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<course> enrolledCourses;
	
	public Student(String name) {
		this.name=name;
		this.enrolledCourses=new ArrayList();
	}
	
	public String getName() {
		return name;
	}
	
	public void enrollInCourse(course course) {
		if(!enrolledCourses.contains(course)) {
			enrolledCourses.add(course);
		}
	}
	public List<course> getEnrolledCourses(){
		return enrolledCourses;
	}
	public String toString() {
		return name;
}

}