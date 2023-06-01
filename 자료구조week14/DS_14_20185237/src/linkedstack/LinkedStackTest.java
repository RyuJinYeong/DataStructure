package linkedstack;

public class LinkedStackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack stack = new LinkedStack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		System.out.println(stack.pop());
		stack.remove();
		System.out.println(stack.peek());
	}	
}
