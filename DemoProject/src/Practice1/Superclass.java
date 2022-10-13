package Practice1;

public class Superclass extends Thisclass {
	
	public void super1()
	{
	int a = super.a;
	int b = 15;
	int c = a+b;
	System.out.println(c);
		System.out.println("super1");
		System.out.println(super.name);
		System.out.println(super.city);
		System.out.println(super.a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Superclass s1 = new Superclass();
		s1.super1();

		
	}

}
