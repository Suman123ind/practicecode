
public class Democlass {

	public void sum()
	{
	int a =10, b =20;
	int c = a+b;
	System.out.println(c);
	}
	
	public void sum(int a, int b)
	{
		int c = a +b;
		System.out.println(c);
		
	}
	
	public int sum(int a,int b, int c, int e) {
		
		return(a+b+c+e);
	}
	public int sum(int a, int b, int c)
	{
		int d = a+b+c;
		return d;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Democlass obj1 = new Democlass();
		obj1.sum();
		obj1.sum(10,20);
		int k = obj1.sum(10, 20, 30);
		System.out.println("The value of k is " +k);
	   int j = obj1.sum(24, 15, 11);
	   System.out.println("The value of j is " +j);
	   int z = obj1.sum(1, 2, 3, 4);
	   System.out.println("The value of z is " +z);
	}

}
