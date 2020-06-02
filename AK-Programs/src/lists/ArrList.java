package lists;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList();
		ArrayList<String> vegetables = new ArrayList();
		
		
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		vegetables.add("Aalu");
		vegetables.add("Bhindi");
		vegetables.add("Lokki");
		
		vegetables.addAll(fruits);
		
		fruits.set(1,"Orange");

		System.out.println(fruits);
		System.out.println(vegetables);
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for (String e: temp) {
			System.out.println(e);
		}
		
		
		/*
		Pair<String, Integer> p1 = new Pair("Himani", 27);
		Pair<String, Boolean> p2 = new Pair("Himani", false);
		
		p1.getDescription();
		p2.getDescription();
		*/
	}

}
