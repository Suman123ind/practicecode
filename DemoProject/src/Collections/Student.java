package Collections;

import java.util.*;

public class Student {
	
	int rollno;
	String name;
	
	Student(int rollno, String name){
		
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student (1,"Suman");
		Student s2 = new Student (2,"Raji");
		
		list.add(s1);
		list.add(s2);
		
		for(Student s: list) {
			System.out.println(s.rollno+" "+s.name);
		}

	}

}
