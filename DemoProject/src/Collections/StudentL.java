package Collections;

import java.util.*;
 
 

public class StudentL {
	
	int rollNo;
	
	StudentL(int rollNo){
		
		this.rollNo = rollNo;
	}
	
	public String toString() {      // toString method used to print values instead of address of the values.
		return " "+rollNo;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<StudentL> ll = new LinkedList<>();
		
		StudentL s1 = new StudentL(1);
		ll.add(s1);
		
		ll.add(new StudentL(2));
		
		Iterator<StudentL> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
