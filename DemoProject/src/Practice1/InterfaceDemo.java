package Practice1;

public interface InterfaceDemo {
	int x = 10;
	void M1();
 	default void M4() {
 		System.out.println("Method4");
 	}

}

