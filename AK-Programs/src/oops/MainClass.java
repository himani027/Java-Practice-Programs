package oops;

class Cat{
	// state of cat
	boolean hasFur;
	String color, breed;
	
	int legs, eyes;
	
	// behavior of cat
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("my cat has " + legs + " legs and " + eyes + " eyes.");
	}
	
}

class Dog {
	
	String breed, name;
	
	public void jump() {
		System.out.println("my dog " + name + " jumped");
	}
	public void description() {
		System.out.println("my dog name is " + name + " and breed is "+ breed);
	}
}
public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.walk();
		
		Cat cat2 = new Cat();
		cat1.eat();
		
		// updating properties
		cat1.legs = 3;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 1;
		
		cat1.description();
		cat2.description();
		
		Dog husky = new Dog();
		Dog poodle = new Dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		
		poodle.breed = "Poddle";
		poodle.name = "Dobby";
		
		husky.jump();
		husky.description();
		
		poodle.jump();
		poodle.description();
		
				
				
		
	}

}
