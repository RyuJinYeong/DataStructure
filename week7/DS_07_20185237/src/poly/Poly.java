package poly;

public class Poly {
	private static final int MAX = 30;
	private int[] coef;
	private int degree;
	
	public Poly() {
		coef = new int[MAX];
		degree = -1;
	}
	
	public boolean isPZero() {
		if (degree < 0) return true;
		return false;
	}
	
	public int coef(int e) {
		return coef[e];
	}
	
	public int maxExp() {
		return degree;
	}
	
	public void addTerm(int c, int e) {
		coef[e] = c;
		if(degree < e)
			degree = e;
	}
	
	public void delTerm(int e) {
		coef[e] = 0;
		if(e == degree) {
			for(int i = e-1; i > 0; i--) {
				if(coef[i] != 0) {
					degree = i;
					break;
				}
			}
			if(e == degree) degree = 0;
		}
	}
	
	
	public void printResult() {
		for(int i = degree; i >= 0; i--) {
			if(coef[i] != 0) {
				if(i == 0) {
					System.out.print("+ " + coef[i]);
					break;
				}
				System.out.print(coef[i]);
				System.out.print("x^"+ i +' ');
			}
		}
		System.out.println();
	}
}