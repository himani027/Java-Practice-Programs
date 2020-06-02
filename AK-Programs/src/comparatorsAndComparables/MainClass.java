package comparatorsAndComparables;

import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(79, "Ram"));
		students.add(new Student(57, "Shyam"));
		students.add(new Student(57, "Aman"));
		students.add(new Student(87, "Anuj"));
		students.add(new Student(90, "Abhi"));
		/*
		Collections.sort(students, new Comparator<Student> () {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.name.contentEquals(o2.name)) {
					return o1.marks - o2.marks;
				} else {
					return o1.name.compareTo(o2.name);
				}
			}
		});
		
		
		Collections.sort(students, (o1, o2) -> {
			if(o1.name.contentEquals(o2.name)) {
				return o1.marks - o2.marks;
			} else {
				return o1.name.compareTo(o2.name);
			}
		});
		*/
		
		//Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
		
		Collections.sort(students, Comparator.comparing(Student::getName))
		.thenComparing(Student::getMarks).reversed();
		
		students.forEach(System.out::println);
	}

}

//class SortByNameTheMarks implements Comparator<Student> {
	
	