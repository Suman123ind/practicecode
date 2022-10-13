package Collections;

import java.util.*;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1 = new ArrayList(); // group of data types can be allowed.
		
		l1.add(1);
		l1.add("Suman");
		l1.add(9.7);
		System.out.println(l1);
		
		List<String> l2 = new ArrayList<>(); // using generic <> only single date type is 
		                                        //allowed.
		
		l2.add("Raju");

		System.out.println(l2);
	}

}
