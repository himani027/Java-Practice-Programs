package methods;

public class PassByValue {

	public static void main(String[] args) {
		/*
		int c = 34;
		int d = 12;
		
		swap(c, d);
		
		System.out.println(c +" " + d);
		
		Dog c = new Dog();
		c.legs = 4;
		Dog d = new Dog();
		d.legs = 3;
		
		swap(c,d);
		
		*/
		Dog wer = new Dog();
		wer.legs = 4;
		changeDog(wer);
		
		//System.out.println(c.legs + " " + d.legs);
		System.out.println(wer.legs);
	}
	static void swap(int a, int b) {
		int temp = a;
		a  = b;
		b = temp;
		
	}
	// overloading
	static void swap(Dog a , Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
		
	}
	
	static void changeDog(Dog dog) {
		dog.legs = 6;
	}
}

class Dog {
	int legs;
}
