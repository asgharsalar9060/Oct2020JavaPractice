package ConstructorConcept;

import java.util.ArrayList;

public class SchoolTest {

	public static void main(String[] args) {
		
		ArrayList<String> subjectList = new ArrayList<String>();
		
		subjectList.add("Physics");
		subjectList.add("Chemistry");
		subjectList.add("Geology");
		subjectList.add("Mathematics");
		subjectList.add("History");
		subjectList.add("Global perspective");

		School obj = new School("MIT", "300 YOAKUM PKWAY", 1200, 12000, false, subjectList);
		
		System.out.println(obj.name + " " + obj.address + " " + obj.teacherNum + " " + obj.studentNum + " " + obj.subjects);
		
		
		
	}

}
