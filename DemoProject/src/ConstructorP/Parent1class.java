package ConstructorP;

public class Parent1class {
	
	public Parent2class p2;
	public Parent3class p3;
	public Parent4class p4;

	
	public void sum() 
	{
		int a = 10, b= 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public Parent1class() {
		
		p2 = new Parent2class();
		p3 = new Parent3class();
		p4 = new Parent4class();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent1class p1 = new Parent1class();
		p1.sum();
		p1.p2.add();
		p1.p3.mul(1, 2);
		p1.p4.parentFour();
			

	}

}
