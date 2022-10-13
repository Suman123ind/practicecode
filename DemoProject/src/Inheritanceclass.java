class parent
{
	public int sum(int a, int b)
	{
		return a+b;
	}
	
}

class child extends parent
{
	public int mul(int a, int b)
	{
		return(a*b);
	}
	
}

public class Inheritanceclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		child c = new child();
		System.out.println(c.sum(10,20));
		System.out.println(c.mul(10,20));
	}

}
