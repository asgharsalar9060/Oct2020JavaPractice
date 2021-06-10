package ConstructorConcept;

import java.util.ArrayList;

public class School {

	String name;
	String address;
	int teacherNum;
	int studentNum;
	boolean isPublic;
	
	ArrayList<String> subjects;

	public School(String name, String address, int teacherNum, int studentNum, boolean isPublic,
			ArrayList<String> subjects) {
		this.name = name;
		this.address = address;
		this.teacherNum = teacherNum;
		this.studentNum = studentNum;
		this.isPublic = isPublic;
		this.subjects = subjects;
	}
	
	
	
	
	
	
}
