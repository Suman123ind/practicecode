package Practice1;

public class Encapsualtion {
	
	private String Name;
	private int ID;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsualtion E1 = new Encapsualtion();
		E1.setName("Suman");
		E1.setID(1234);
		System.out.println(E1.getName());
		System.out.println(E1.getID());
	}

}
