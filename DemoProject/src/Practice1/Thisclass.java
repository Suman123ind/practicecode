package Practice1;

public class Thisclass {
	
	String name = ("Java code");
	String city = "Rajahmundry";
	int a = 5;
	
	public void method()
	{
		String name = ("Java course");
		String city = ("Vizag");
		
		this.name=name;
		city = this.city;
		System.out.println(name);
		System.out.println(this.city);
	}
	
	public void sum()
	{
	
		int a = this.a;
		 int b = 10;
		
		int c = a+b;
		System.out.println(c);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thisclass t1 = new Thisclass();
		t1.method();
		t1.sum();
	}

}
