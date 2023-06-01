package fibo;

public class CheckTime {
	public static final int MAX_N = 45;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long beforeTime = System.currentTimeMillis();
		
		for(int i=0; i <= MAX_N; i++)
			Fibo.fib_1(i);
		
		long afterTime = System.currentTimeMillis();
		
		System.out.println("재귀함수 : "+(double)(afterTime - beforeTime) / 1000 + "s");
		
		beforeTime = System.currentTimeMillis();
		
		for(int i = 0; i<= MAX_N; i++)
			Fibo.fib_2(i);
		
		afterTime = System.currentTimeMillis();
		
		System.out.println("반복문 : "+(double)(afterTime - beforeTime) / 1000 + "s");
	}

}
/*
	두 메소드의 실행시간 차이가 생기는 이유 작성 
	재귀함수를 이용한 메소드는 같은 값을 구하더라도 반복문보다 비효율적인 함수의 호출이 더 많아지기 때문에 실행시간에 차이가 난다.	
*/