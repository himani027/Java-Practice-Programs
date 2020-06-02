package oops;

class Vehicle {
	
	int wheels;
	String color;
	
	Vehicle (int noOfWheels){
		wheels = noOfWheels;
	}
	
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
	}
	
}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {

		MyConstructor obj = new MyConstructor();
		
		Vehicle car = new Vehicle(4);
		Vehicle scooty = new Vehicle(2);
		
		Vehicle eRikshaw = new Vehicle(3, "yellow");
				
		System.out.println(car.wheels + " wheels");
		System.out.println(scooty.wheels + " wheels");
		System.out.println(eRikshaw.wheels + " wheels & color " + eRikshaw.color);
	}

}
