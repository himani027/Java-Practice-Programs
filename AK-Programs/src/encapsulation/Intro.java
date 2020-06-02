package encapsulation;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		
//		obj.name = "Tom";
//		obj.age = 10;
		
		obj.setAge(10);
		
		System.out.println(obj.getAge());
	}

}
