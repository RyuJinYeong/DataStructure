package p2;
import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0, cnt = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			max = sc.nextInt();
			for(cnt = 1; cnt <= max; cnt++)
			{
				for(int i = 0; i < cnt; i++)
					System.out.print("*");
				System.out.print("\n");
			}
			
			if(max < 0)
				break;
		}
		
		sc.close();
	}

}
