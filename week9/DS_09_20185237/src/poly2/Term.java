package poly2;

public class Term {
	private int coef = 0;
	private int exp = 0;
	
	public Term(int coef, int exp)
	{
		this.coef = coef;
		this.exp = exp;
	}
	
	public int getCoef()
	{
		return this.coef;
	}
	
	public int getExp()
	{
		return this.exp;
	}
}
