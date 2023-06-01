package arraystack;

public class ArrayStack {
	private int top;
	private int stackSize;
	private int increment;
	private Object[] itemArray;
	
	public ArrayStack() {
		top = -1;
		stackSize = 2;
		increment = 10;
		itemArray = new Object[stackSize];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(Object x) {
		if(top == stackSize-1)
		{
			stackFull();		
		}	

		top++;
		itemArray[top] = x;
	}
	
	public void stackFull() {
		stackSize++;
		Object[] temp = new Object[stackSize];
		
		for(int i = 0; i<stackSize-1; i++)
		{
			temp[i] = itemArray[i];
		}
		itemArray = temp;
	}
	
	public Object pop() {
		return itemArray[top--];
	}
	
	public void remove() {		
		top--;
	}
	
	public Object peek() {
		return itemArray[top];
	}
}
