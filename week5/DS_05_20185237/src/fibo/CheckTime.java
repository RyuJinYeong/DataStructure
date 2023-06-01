package fibo;

public class CheckTime {
	public static final int MAX_N = 45;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long beforeTime = System.currentTimeMillis();
		
		for(int i=0; i <= MAX_N; i++)
			Fibo.fib_1(i);
		
		long afterTime = System.currentTimeMillis();
		
		System.out.println("����Լ� : "+(double)(afterTime - beforeTime) / 1000 + "s");
		
		beforeTime = System.currentTimeMillis();
		
		for(int i = 0; i<= MAX_N; i++)
			Fibo.fib_2(i);
		
		afterTime = System.currentTimeMillis();
		
		System.out.println("�ݺ��� : "+(double)(afterTime - beforeTime) / 1000 + "s");
	}

}
/*
	�� �޼ҵ��� ����ð� ���̰� ����� ���� �ۼ� 
	����Լ��� �̿��� �޼ҵ�� ���� ���� ���ϴ��� �ݺ������� ��ȿ������ �Լ��� ȣ���� �� �������� ������ ����ð��� ���̰� ����.	
*/