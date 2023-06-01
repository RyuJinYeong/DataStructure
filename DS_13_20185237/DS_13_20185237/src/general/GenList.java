package general;

public class GenList {
	private ListNode head; // ����Ʈ�� ù ��° ListNode�� ���� ������ ����


	public GenList copy() { 
		GenList gn = new GenList();
		gn.head = theCopy(head);
		return gn;
	}
	public boolean equal(GenList T) {
		return theEqual(this.head, T.head);
	}
	public int depth() {
		return theDepth(head);
	}
	
	public void insertData(Object x) {
		ListNode n = new ListNode();
		n.data = x;
		n.link = head;
		head = n;	
	}
	
	public void printGL() { 
		System.out.print("(");
		ListNode p = head;
		while(p!=null)
		{
			if(p.data instanceof GenList)
			{
				((GenList)p.data).printGL();
			} else {
				System.out.print(p.data);
			}
			if((p = p.link) != null)
			{
				System.out.print(", ");
			}
		}
		System.out.print(")");
	}
	
	private boolean theEqual(ListNode s, ListNode t) {
		if (s == null && t == null) return true;
        if (s == null && t != null) { return false;}
        if (s != null && t == null) { return false;}
        if (s.data instanceof GenList && t.data instanceof GenList) {
            if (((GenList)s.data).equal((GenList)t.data)) return theEqual(s.link, t.link);
            else { return false; }
        } else if (!(s.data instanceof GenList) && !(t.data instanceof GenList)) {
            if (s.data.equals(t.data)) return theEqual(s.link, t.link);
            else {return false; } 
        } else {return false;}
    }

	
	private ListNode theCopy(ListNode h) { 
		ListNode p = null;
        Object q;
        ListNode r;
        if (h != null) {
            if (!(h.data instanceof GenList)) q = h.data;
            else q = ((GenList)h.data).copy();
            r = theCopy(h.link);
            p = new ListNode();
            p.data = q;
            p.link = r;
        }
        return p;
	}

	
	private int theDepth(ListNode h) {
		int max = 0;
        int d;
        ListNode p;
        if (h == null) return 0;
        p = h;
        while (p != null) {
            if (p.data instanceof GenList) {
                d = ((GenList)p.data).depth();
            } else {
                d = 0;
            }
            if (d > max) max = d;
            p = p.link;
        }
        return max+1;
    }


}
