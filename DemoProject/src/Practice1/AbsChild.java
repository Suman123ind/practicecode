package Practice1;

public class AbsChild extends AbstractClass {
	
	void M1() {
		System.out.println("Method1");
	}

	void M2() {
		System.out.println("Method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsChild AB = new AbsChild();
		AB.M1();
		AB.M2();
		AB.M3();
		
	}

}
