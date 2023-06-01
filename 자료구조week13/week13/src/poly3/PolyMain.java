package poly3;



public class PolyMain {

	public static void main(String[] args) {
		Polynomial poly1 = new Polynomial();
		poly1.addTerm(5, 0);
		poly1.addTerm(2, 1);
		poly1.addTerm(3, 2);
		poly1.addTerm(7, 3);
		System.out.print("Poly 1 : ");
		poly1.print();
		
		Polynomial poly2 = new Polynomial();
		poly2.addTerm(-1, 0);
		poly2.addTerm(2, 1);
		poly2.addTerm(-3, 2);
		poly2.addTerm(4, 4);
		System.out.print("Poly 2 : ");
		poly2.print();
		
		System.out.print("Poly1 * 2x^0 = ");
		poly1.sMult(2, 0).print();
		System.out.print("Poly1 * 2x^1 = ");
		poly1.sMult(2, 1).print();
		
		System.out.print("Poly1 + Poly2 = ");
		poly1.polyAdd(poly2).print();

		System.out.print("Poly1 * Poly2 = ");
		poly1.polyMult(poly2).print();
	}
}
