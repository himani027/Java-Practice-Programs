package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		/*
		int c = a & b;
		System.out.println(c);
		
		int d = a | b;
		System.out.println(d);
		*/
		
		int c = b >> 1;
		System.out.println(c);
		
		int d = b << 3;
		System.out.println(d);

	}

}
