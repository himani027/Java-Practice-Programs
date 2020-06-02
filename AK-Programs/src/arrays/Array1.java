package arrays;

public class Array1 {

	public static void main(String[] args) {

		int[] age = {2, 5, 1, 6, 23};
		
		double[] marks = {1.0, 3.14, 2.9};
		
		marks[1] = 4.56;
		
		System.out.println(marks[1]);
		
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}

	}

}
