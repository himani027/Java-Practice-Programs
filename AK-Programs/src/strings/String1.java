package strings;

public class String1 {

	public static void main(String[] args) {

		String name = "Himani Dalal";
		String anotherName = new String("Himani Dalal");
		
		System.out.println(name == anotherName);
		
		System.out.println(name);
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(1));
		
		System.out.println(name.substring(1,8));
		
		System.out.println(name.contains("ala"));
		
		System.out.println(name.equals("Dalal"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.concat(" SICS1"));
		
		System.out.println(name.replace("l","R"));
		
		String cars = "Audi,BMW,Mercedes,Ferrari,Lamborghini";
		String allCars[] = cars.split(",");
		
		for (String car: allCars) {
			System.out.println(car);
		}
		
		System.out.println(cars.indexOf("M"));
		
		System.out.println(cars.toLowerCase());
		
		System.out.println(cars.toUpperCase());
		
		System.out.println(name.trim());
		
		

	}

}
