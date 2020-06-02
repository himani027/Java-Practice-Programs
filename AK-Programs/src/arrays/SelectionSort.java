package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = {5,2,-1,6,3};
		int n = a.length;
		
		for (int i = 0; i < n-1; i++) {
			
			int indexOfMinEle = i;
			for (int j = i; j < n ; j++) {
				
				if (a[j] < a[indexOfMinEle]) {
					indexOfMinEle = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[indexOfMinEle];
			a[indexOfMinEle] = temp;
		
		}
		for (int e : a) {
			System.out.print(e + " ");
		}

	}

}
