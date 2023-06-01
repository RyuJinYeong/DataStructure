package post;

public class LinkedStack {
	private ListNode top;
	
	public boolean isEmpty()
	{
		return (top == null);
	}
	
	public void push(Object x)
	{
		if(isEmpty())
		{
			top = new ListNode();
			top.data = x;
			return;
		}
		
		ListNode temp = new ListNode();
		temp.data = x;
		temp.link = top;
		top = temp;
	}
	
	public Object pop()
	{
		Object temp = top.data;
		top = top.link;
		return temp;
	}
	
	public void remove()
	{
		top = top.link;
	}
	
	public Object peek()
	{
		if(isEmpty())
			return null;
		return top.data;
	}
}
