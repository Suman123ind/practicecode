package Practice2; // child class 1 

import Practice1.Poneclass; // single inheritance 

public class Coneclass extends Poneclass {
	
	public void sum() 
	{
		int a = 10;
		int b = 20;
		 int c=a+b;
		 System.out.println(c);
	}

	public int add(int a, int b) 
	{
		return (a+b)-10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coneclass c1 = new Coneclass();
		c1.sum();
		System.out.println(c1.sum(1, 2, 3));
		System.out.println(c1.sum1(4, 5, 6));
		System.out.println(c1.sum2(7, 8, 9));
		System.out.println(c1.add(10, 10));
	}

}
