package recursion2;

public class GCD_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {12, 36, 48, 24, 27};
		
		int [] array2 = new int[10];
		array2[0] = 2;
		array2[3] = 4;
		array2[5] = 8;
		
		System.out.println("Array 1 : " + multi_gcd(array1));
		System.out.println("Array 2 : " + multi_gcd(array2));

	}
	
	public static int multi_gcd(int[] array)
	{
		int n = array[0];
		int size = array.length;
		
		for(int i = 0; i<size; i++)
		{
			n = GCD.gcd(n, array[i]);
		}
		return n;
	}
}
