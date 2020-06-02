package maps;

import java.util.*;
import java.util.Map.Entry;


public class MainClass {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
				
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		
		
		
		System.out.println(numbers);
		System.out.println(numbers.get("Four"));
		
		Set<Entry<String, Integer>> entries = numbers.entrySet();
		
		for(Entry<String, Integer> entry: entries) {
			entry.setValue(entry.getValue() * 100);
			
		}
		System.out.println(numbers);
		
	}
}
