package methods;

public class Intro {
 
	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result = maxOf(firstNumber, secondNumber);
		
		maxOf(123,432,900);
		System.out.println(result);
		
		sayHi();
		sayHi();
	}
	
	static int maxOf (int a, int b) {
		if (a > b) {
			return a;
		} else {
		return 0;
		}
	}
	
	static int maxOf (int a, int b, int c) {
		if (a > b) {
			return a;
		} else {
		return 0;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}
}
