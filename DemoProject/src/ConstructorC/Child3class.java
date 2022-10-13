package ConstructorC;

import ConstructorP.Parent1class;

public class Child3class extends Parent1class {
	
	public void childThree() {
		
		System.out.println("childThree");
		
		p2.add();
		p3.mul(6, 5);
		p4.parentFour();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child3class c3 = new Child3class();
		c3.childThree();
		c3.sum();
		
	}

}
