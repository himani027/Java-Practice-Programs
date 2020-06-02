package conditionalStatement;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		int day = 2;
		
		switch (day) {
		case 1:
			System.out.println("I'm on leave");
			break;
		case 2:
			System.out.println("I'm in Office");
			break;
		case 3:
			System.out.println("I'm playing cricket");
			break;
			
			default:
				System.out.println("I don't know what day it is");
			
		}
	}
	

}
