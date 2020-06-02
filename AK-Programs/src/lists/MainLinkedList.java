package lists;
import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
//		ll.add(12);
//		ll.add(32);
//		ll.add(46);

		List<Integer> al = new ArrayList<>();
		
		// System.out.println(ll);
		
		getTimeDiff(al);
		getTimeDiff(ll);

	}
	
	static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			//list.add(i); // ArrayList
			list.add(0, i); // LinkedList
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " --> " + (end - start));
	
	}

}
