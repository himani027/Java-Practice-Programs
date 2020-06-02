package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		// waits for input and assign it to x
		
		System.out.println(x);
		
		double y = sc.nextDouble();
		
		System.out.println(y);
		
		
		String hello = sc.nextLine();
		
		System.out.println(hello);
		
		
		// Program to calculate Simple Interest
		
		int principal = 5000;
		float rate = 12.5f;
		int time = 12;
		
		float simpleInterest = principal * rate * time /100;
		
		System.out.println("The Simple Interest is " + simpleInterest);
		
		*/
		
		// using Scanner
		
		Scanner sc = new Scanner(System.in);
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principal * rate * time /100;
		
		System.out.println("The Simple Interest is " + simpleInterest);
		
	}

}
