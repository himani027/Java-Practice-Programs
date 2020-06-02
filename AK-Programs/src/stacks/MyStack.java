package stacks;

import lists.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList();
	
	void push (E e) {
		ll.add(e);	// last
	}
	
	E pop() throws Exception {
		if (ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed. ");
			
		}
		return ll.removeLast();		// pop
		
	}
	
	E peek() throws Exception {
		if (ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed. ");
			
		}
		return ll.getLast();
		
	}
	

}
