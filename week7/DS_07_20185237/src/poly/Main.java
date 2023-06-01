package poly;

public class Main {
	public static void main(String[] args)
	{
		Poly poly = new Poly();
		poly.addTerm(5, 0);
		poly.addTerm(2, 1);
		poly.addTerm(3, 2);
		poly.addTerm(7, 7);
		poly.printResult();
		
		poly.delTerm(2);
		poly.printResult();
		
		System.out.println(poly.maxExp());
	}
}
