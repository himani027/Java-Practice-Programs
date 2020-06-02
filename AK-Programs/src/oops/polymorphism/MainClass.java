package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		// run time
		Dog d = new Dog();
		
		Pet p = d;
		Animal a = d;
		
		d.walk();
		p.walk();
		
		System.out.println(d.name);
		System.out.println(p.name);

		// compile time
		
		greetings("hello", 2);
		
	}
		
		public static void greetings() {
			System.out.println("Hi");
		}
		public static void greetings(String s) {
			System.out.println(s);
		}
		
		public static void greetings(String s, int count) {
			for (int i = 0; i < count; i++) {
				System.out.println(s);
				}
		}
		
		
		
		

	

}
