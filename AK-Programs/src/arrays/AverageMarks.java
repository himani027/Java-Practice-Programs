package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of student : ");
		int n = sc.nextInt();
		
		int marks[] =  new int[n];
		
		System.out.println("Enter the marks : ");
		
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		
		int averageMarks = 0;
		
		for (int i = 0; i < n; i++) {
			averageMarks += marks[i];
		}
		
		averageMarks /= n;
		
		System.out.println("The average marks are " + averageMarks);

	}

}
