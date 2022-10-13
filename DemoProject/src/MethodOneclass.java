
public class MethodOneclass {
	
	public float A1(float a, float b) 
	{
		return a+b;
	}

	public float A2(float a, float b) {
		return A1(a,b)/2;
	}
	
	public float A3(float a, float b) {
		return A2(a,b)+10;
	}

	public boolean A4(int a,int b) {
		if (a==b) {
			return true;
		}
			else {
				return false;
			}
			
			}
	
	public void A5(int a, int b) {
		
		if(A4(a,b)) {
			System.out.println("both are matched and true");
		}
		else {
			System.out.println("both are not matched and false");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOneclass obj = new MethodOneclass();
		obj.A3(1, 2);
		System.out.println(obj.A3(1, 2));
		obj.A5(10, 10);
		
	}

}
