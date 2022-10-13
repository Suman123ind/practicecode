
public class DemoClass1 {
	static int x = 10; // when we use static we wont use obj in main method.
	int j = 20; // we have to call this line using obj
	
	public int sum(int a,int b)
	{
		int c = a + b;
		return c;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoClass1 obj = new DemoClass1();
		int k= obj.sum(10, 20);
		System.out.println("The value of k is " +k);
	
		System.out.println(obj.j);
		System.out.println(x);
	}

}
