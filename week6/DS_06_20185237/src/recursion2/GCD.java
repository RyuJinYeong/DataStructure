package recursion2;

public class GCD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("36, 12 : "+ lcm(12,36));
	}
	
	public static int gcd(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		
		if(a>b)
		{
			return gcd(b,a%b);
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	
	public static int lcm(int a, int b)
	{
		
		return a*b/gcd(a,b);
	}
}
