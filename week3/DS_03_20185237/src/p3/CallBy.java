package p3;

public class CallBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 1;
		int number2 = number1;
		
		number2 = 3;
		
		System.out.println(number1);
		
		int [] array1 = {1,3,5,6};
		int [] array2 = array1;
		
		array2[0] = 9;
		
		System.out.println(array1[0]);

	}

}
/*
	number2�� number1�� ���� ���ڷ� �޾� �����Ͽ��� ������ �߰��� number2�� ���� ���� �����ص� number1�� ������ ������ ��ġ�� �ʴ´�.
	array2���� array1�� �ּҰ��� �����Ͽ��� ������ �߰��� array2[0]�� ���� �����ϸ� ���� �ּҰ��� array1[0]�� ���� ���� �����˴ϴ�.
*/