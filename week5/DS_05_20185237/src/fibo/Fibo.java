package fibo;

public class Fibo {
	public static final int MAX_N = 10;
	
	public static void main(String[] args) 
	{
		for(int i = 0; i<=MAX_N; i++)
			System.out.println(fib_1(i));
		
		System.out.println("-----------------------------------");
		
		for(int i=0; i<= MAX_N; i++)
			System.out.println(fib_2(i));
	}
	
	public static int fib_1(int n)
	{
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		
		return fib_1(n-1) + fib_1(n-2);

		// Àç±Í
	}
	
	public static int fib_2(int n)
	{
		int[] t = new int[MAX_N];
		
		t[0] = 0;
		
		if(n == 0)
			return t[0];
		
		t[1] = 1;
		
		if(n == 1)
			return t[1];
		
		for(int i = 2; i < n; i++)
		{
			t[i] = t[i-1] + t[i-2];			
		}
		
		return t[n-1]+ t[n-2];
	}
}
