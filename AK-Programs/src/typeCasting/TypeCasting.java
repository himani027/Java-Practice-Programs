package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
	 
	// Widening - Automatic type casting	
		byte x = 4;
		
		int y = x;
		
		System.out.println(y);
		
		int a = 4;
		
		double b = x;
		
		System.out.println(b);
		
	// Narrowing - Manual type Casting
		double myDob = 3.94; 
		
		int myInt = (int)myDob;
		
		// floor value is consider
		System.out.println(myDob);
		System.out.println(myInt);
		

	}

}
