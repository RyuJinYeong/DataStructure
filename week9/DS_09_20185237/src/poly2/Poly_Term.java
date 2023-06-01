package poly2;

public class Poly_Term {
	private static final int MAX = 50;
	private Term[] terms;
	private int noOfTerms;
	
	public Poly_Term() {
		terms = new Term[MAX];
		noOfTerms = 0;
	}
	
	public boolean isPZero() {
		if (noOfTerms == 0) return true;
		return false;
	}
	
	public int coef(int e) {
		return terms[e].getCoef();
	}
	
	public int maxExp() {
		return terms[noOfTerms].getExp();
	}
	
	public boolean addTerm(int c, int e) {
		terms[e] =  new Term(c,e);						
		if(noOfTerms < e)
		{
			noOfTerms = e;
		}
		return true;
	}
	
	public boolean delTerm(int e) {		
		terms[e] = new Term(0,0);
		if(e == noOfTerms) {
			for(int i = e-1; i > 0; i--) {
				if(terms[i].getCoef() != 0) {
					noOfTerms = i;
					break;
				}				
			}
			if(e == noOfTerms) noOfTerms= 0;
		}
		return true;
	}	
	
	public Poly_Term sMult(int c, int e) {
		Poly_Term p = new Poly_Term();
		p.noOfTerms = noOfTerms;
		int exp, coef;
		for(int i = 0; i <= noOfTerms; i++) {
			exp = terms[i].getExp() + e;
			coef = terms[i].getCoef() * c;
			
			p.terms[i] = new Term(coef, exp);
		}
		return p;		
	}
	
	public Poly_Term polyAdd(Poly_Term p) {
		Poly_Term r = new Poly_Term();
		int tp = 0; int pp = 0;
		while(tp < noOfTerms && pp < p.noOfTerms) {
			if(this.terms[tp].getExp() == p.terms[pp].getExp()) {
				r.addTerm(this.terms[tp].getCoef() + p.terms[pp].getCoef(),
						p.terms[pp].getExp());
				tp++; pp++;
			} else if (this.terms[tp].getExp() < p.terms[pp].getExp()) {
				r.addTerm(p.terms[pp].getCoef(), p.terms[pp].getExp());
				pp++;
			} else {
				r.addTerm(this.terms[tp].getCoef(), this.terms[tp].getExp());
				tp++;
				}
		}
		while(tp < this.noOfTerms) {
			r.addTerm(this.terms[tp].getCoef(), this.terms[tp].getExp());
			tp++;
		}
		while(pp < p.noOfTerms) {
			if(p.terms[pp] != null)
			{
				r.addTerm(p.terms[pp].getCoef(), p.terms[pp].getExp());
				pp++;
			}
		}
		return r;
	}
	
	public Poly_Term polyMult(Poly_Term p) {
		Poly_Term a = new Poly_Term();
		
		for(int i = 0; i < noOfTerms; i++) {
			if(p.terms[i] != null) {
				Poly_Term temp = this.sMult(p.terms[i].getCoef(), p.terms[i].getExp());
				a = a.polyAdd(temp);
			}
		}
		return a;
	}
	
	
	
	public void printResult() {
		if(noOfTerms == 0)
		{
			System.out.print(terms[0].getCoef());
			return;
		}
		
		for(int i = noOfTerms; i >= 0; i--) {
			if(terms[i] != null) {
				if(i == 0) {
					System.out.print(terms[i].getCoef());
					break;
				}
				System.out.print(terms[i].getCoef() + "x^" + i + " + ");		
			}
		}
		System.out.println();
	}
}
