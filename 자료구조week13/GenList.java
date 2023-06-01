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
	
	public void insertData(Object x) { /* ����Ʈ head ������ ���ο� ListNode�� ���� */ }
	public void printGL() { }
	private boolean theEqual(ListNode s, ListNode t) {}
	private ListNode theCopy(ListNode h) { }
	private int theDepth(ListNode h) {}

}
