package paren;

public class Paren {
	public static boolean check(String exp)
	{
		CharStack s = new CharStack();
		
		int len = exp.length();
		
				
		for(int i = 0; i < len; i++)
		{
			if(exp.charAt(i) == '{' || exp.charAt(i) == '(' || exp.charAt(i) == '[')
			{
				s.push(exp.charAt(i));
			}			
		}
		
		
		
		for(int i = 0; i < len; i++)
		{
			if(exp.charAt(i) == '}' && s.peek() == '{')
			{
				s.pop();
			}
			
			if(exp.charAt(i) == ']' && s.peek() == '[')
			{
				s.pop();
			}
			 
			if(exp.charAt(i) == ')' && s.peek() == '(')
			{
				s.pop();
			}
			 
		}
				
		return s.isEmpty();
	}
}
