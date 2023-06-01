package p4;

public class PrintArray {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		
		printArray(array1);
	}
	
	public static void printArray(int[] array)
	{
		System.out.print("Output : ");
		int length = 0;
        for(int Elements : array)
            length++;
		
		for(int i = 0; i<length; i++)
		{
			System.out.print(array[i]+ " ");
		}
	}
}
