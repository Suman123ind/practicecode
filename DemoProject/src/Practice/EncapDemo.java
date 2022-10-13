package Practice;

public class EncapDemo {
	
	private int EmployeeID ;
	private String Employeename;
	
	public void setEmployeeID(int EmployeeID) {
		this.EmployeeID = EmployeeID;
	}
	
	public int getEmployeeID() {
		 return EmployeeID;
		 
	}

	public void setEmployeename(String Employeename) {
		
		this.Employeename = Employeename;
	}
	
	public String getEmployeename() {
		return Employeename;
	}
	


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapDemo E = new EncapDemo();
		E.setEmployeeID(1);
		E.setEmployeename("Student");
	
		
		
		System.out.println(E.getEmployeeID());
		System.out.println(E.getEmployeename());

		

	}

}
