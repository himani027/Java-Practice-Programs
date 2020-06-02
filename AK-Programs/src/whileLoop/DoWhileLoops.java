package whileLoop;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		int n = 0;
		
		do {
			System.out.println("n is " + n);
		} while (n != 0);
*/
		int n = 1;
		
		do {
			n = sc.nextInt();
			System.out.println("Number is " + n);
		} while (n != 0);
	}

}
