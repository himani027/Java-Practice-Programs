package operators;

public class LogicalOperator {

	public static void main(String[] args) {

		int number = 45;
		
		if (number >= 1 && number <= 100) {
			System.out.println("Number is in the range");
			
			int grade= 11;
			
			if (!(grade == 10 || grade == 12)) {
				System.out.println("You can not give boards exam now");
			}
		}

	}

}
