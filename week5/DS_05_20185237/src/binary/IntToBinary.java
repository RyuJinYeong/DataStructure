package binary;

public class IntToBinary {
	public static String str = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToBinary(100));
	}
	
	private static String intToBinary(int n)
	{
		if(n == 0)
			return str;
		
		str = n%2 + str;
		
		
		return intToBinary(n/2);		
	}
}
