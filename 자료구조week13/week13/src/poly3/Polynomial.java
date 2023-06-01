package poly3;

public class Polynomial {
	private PolyNode firstNode;
	private PolyNode lastNode;
	
	public Polynomial() {
		firstNode = null;
		lastNode = null;
	}
	
	public boolean ispZero() {
		if(firstNode == null)
			return true;
		else
			return false;		
	}
	
	public void addTerm(int c, int e) {
		PolyNode temp = new PolyNode(c,e);
		PolyNode p = firstNode;
		
		if(ispZero())
		{
			firstNode = temp;
			lastNode = temp;
			return;
		}
		else if(e >= p.exp)
		{
			temp.link = firstNode;
			firstNode = temp;
			return;
		}
		else
		{
			while(p.link != null)
			{
				if(e > p.link.exp)
				{
					temp.link = p.link;
					p.link = temp;
					return;
				}
				p = p.link;
			}
			p.link = temp;
			lastNode = temp;
		}
	}
	
	public void delTerm(int e) {
		if(firstNode == null)
			return;
		if(firstNode.exp == e)
		{
			firstNode = firstNode.link;
			if(firstNode == null)
				lastNode = null;
		} else {
			PolyNode t = firstNode;
			
			while(t.link != null)
			{
				if(t.link.exp == e)
				{
					t.link = t.link.link;
					if(t.link == null)
						lastNode = t;
					break;
				}
				t = t.link;
			}
		}		
	}
	
	public Polynomial sMult(int c, int e) {
		PolyNode p = this.firstNode;
		Polynomial res = new Polynomial();
				
		while(p != null)
		{			
			res.appendTerm(p.coef * c, p.exp +e);
			p = p.link;
		}
		
		return res;
	}
	
	public Polynomial polyMult(Polynomial q) {
		Polynomial newP = new Polynomial();
		PolyNode p = q.firstNode;
		
		while(p != null)
		{
			Polynomial temp = sMult(p.coef, p.exp);
			newP = newP.polyAdd(temp);
			p = p.link;
		}
		return newP;
		
		/*
		Polynomial p = new Polynomial();
		
		PolyNode a = this.firstNode;
		PolyNode b = q.firstNode;
		
		while(a != null)
		{
			b = q.firstNode;
			while(b != null)
			{
				p.addTerm(a.coef*b.coef, a.exp+b.exp);
				b = b.link;
			}
			a = a.link;
		}
		
		PolyNode temp = p.firstNode;
		
		while(true)
		{
			if(temp.link == null)
				break;
			
			if(temp.exp == temp.link.exp)
			{
				temp.coef = temp.coef+temp.link.coef;
				temp.link = temp.link.link;
				continue;
			}
			temp = temp.link;			
		}
		return p;
		*/		
	}
	
	public void appendTerm(int c, int e) {
		PolyNode node = new PolyNode(c,e);
		if(firstNode == null) {
			firstNode = node;
			lastNode = node;
		} else {
			lastNode.link = node;
			lastNode = node;
		}
	}
	
	public Polynomial polyAdd(Polynomial poly) {
		PolyNode q = poly.firstNode;
		PolyNode p = this.firstNode;
		Polynomial res = new Polynomial();
		
		while(p != null && q != null)
		{
			if(p.exp == q.exp)
			{
				int temp = p.coef + q.coef;
				if(temp != 0)
					res.appendTerm(p.coef + q.coef, p.exp);
				p = p.link;
				q = q.link;	
			} else if(p.exp < q.exp) {
				res.appendTerm(q.coef, q.exp);
				q = q.link;
			} else {
				res.appendTerm(p.coef, p.exp);
				p = p.link;
			}
		}
		
		while(p != null) {
			res.appendTerm(p.coef, p.exp);
			p = p.link;
		}
		
		while(q != null) {
			res.appendTerm(q.coef, q.exp);
			q = q.link;
		}
		
		return res;
	}
	
	public void print() {
		PolyNode p = firstNode;
		while(p != null) {
			System.out.print(p.coef + "x^" + p.exp + " + ");
			p = p.link;
		}
		System.out.println();
	}
}
