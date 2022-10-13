package Practice2; // child class 2

import Practice1.Poneclass; // hierarchichy inheritance - two child class can use 
                               //the parent class property. 

public class Ctwoclass extends Poneclass {
	
	public int mul() 
		{
		int a = 10, b= 20;
		int c = a*b;
		return c;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ctwoclass c2 = new Ctwoclass();
		System.out.println(c2.mul());
		System.out.println(c2.sum(10, 20, 30));
		System.out.println(c2.sum1(10, 20, 10));
	}

}
