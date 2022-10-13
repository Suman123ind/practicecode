package Practice1;

public class InterfaceChild implements InterfaceDemo,InterfaceDemo1,InterfaceDemo2{
	
	public void M1() {
		System.out.println("Method1");
	}
	
	public void M2() {
		System.out.println("Method2");
		
	}
	
	public void M3() {
		System.out.println("Method3");
	}

	/*public void M4() {
		System.out.println("Kishore");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceChild I1 = new InterfaceChild();
		I1.M1();
		I1.M2();
		I1.M3();
		I1.M4();
		System.out.println(x);
		System.out.println(y);

		System.out.println(z);

	}

}
