package ConstructorC;

import ConstructorP.Parent1class;

public class Child1class extends Parent1class {
	
	public void add(int d , int e)
	
	{
		int f = (d+e)+2;
		System.out.println(f);
		
		p2.add();
	    p3.mul(3, 4);
		p4.parentFour();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1class c1 = new Child1class();
		c1.add(5, 5);
		c1.sum();
	}

}
