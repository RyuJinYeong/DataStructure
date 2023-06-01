package paren;


public class CharStack {
	private CharNode top;
		
	public boolean isEmpty()
	{
		return (top == null);
	}
	
	public void push(char x)
	{
		if(isEmpty())
		{
			top = new CharNode();
			top.data = x;
			return;
		}
		
		CharNode temp = new CharNode();
		temp.data = x;
		temp.link = top;
		top = temp;
	}
	
	public char pop()
	{
		char temp = top.data;
		top = top.link;
		return temp;
	}
	
	public void remove()
	{
		top = top.link;
	}
	
	public char peek()
	{
		if(!isEmpty())
			return top.data;
		return 0;
	}
}
