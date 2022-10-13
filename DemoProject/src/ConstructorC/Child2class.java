package ConstructorC;

import ConstructorP.Parent1class;

public class Child2class extends Parent1class {
	
	public void childTwo()
	{
		System.out.println("childtwo");
		
		p2.add();
		p3.mul(5, 6);
		p4.parentFour();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child2class c2 = new Child2class();
		c2.childTwo();
		c2.sum();
		

	}

}
