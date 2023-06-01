package recursion2;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(3,'A','B','C');
	}
	
	public static void hanoi(int n, char orig, char dest, char temp)
	{
		if(n == 1)
		{
			System.out.println("Move dist "+n+" from "+orig+" to "+dest);
			return;
		}
			
		hanoi(n-1, orig,temp,dest);
		System.out.println("Move dist "+n+" from "+orig+" to "+dest);
		hanoi(n-1,temp,dest,orig);
	}
	
}
