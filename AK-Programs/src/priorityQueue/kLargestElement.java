package priorityQueue;

import java.util.*;
import java.lang.*;
import java.io.*;

public class kLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for (int i = 0; i < n; i++) {
				if (i < k) {
					pq.add(a[i]);
				}
				else {
					if (pq.peek() < a[i]) {
						pq.poll();
						pq.add(a[i]);
					}
					
				}
			}
			ArrayList<Integer> ans = new ArrayList<>(pq);
			Collections.sort(ans, Collections.reverseOrder());
			
			for (int x: ans) {
				System.out.println(x + " ");
			}
			System.out.println();
		}
	}

}
