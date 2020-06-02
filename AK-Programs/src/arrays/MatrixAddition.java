package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter dimensions : ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		
		int m1[][] = new int[rows][cols];
		int m2[][] = new int[rows][cols];
		
		System.out.println("Enter array m1 : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter array m2 : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		
		
		int add[][] = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				add[i][j] = m1[i][j] + m2[i][j];
			}
		}
		System.out.println("Addition of arrays : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(add[i][j]+ " ");
				
			}
		System.out.println();
	}

	}
}
