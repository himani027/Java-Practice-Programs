package lists;

public class OtherLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<String> myll = new MyLinkedList();
		
		for (int i = 0; i < 10; i++) {
			myll.add(i+ "A");
		}
		
		myll.print();
		

	}

}
