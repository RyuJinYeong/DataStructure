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
	number2는 number1의 값을 인자로 받아 복사하였기 때문에 중간에 number2의 값을 따로 변경해도 number1의 값에는 영향을 끼치지 않는다.
	array2에는 array1의 주소값을 참조하였기 때문에 중간에 array2[0]의 값을 수정하면 값은 주소값의 array1[0]의 값도 같이 수정됩니다.
*/