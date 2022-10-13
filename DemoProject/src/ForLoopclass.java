
public class ForLoopclass {
	
	public void forMethod()
	{
		for(int i=0; i<=10; i++) {
			if(i==5) {
				continue;
			}
			else {
				System.out.println("The value of i is " +i);
			}
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoopclass obj = new ForLoopclass();
		obj.forMethod();
	}

}
