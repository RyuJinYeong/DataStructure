package list;

public class LinkedList {
	private int length;
	private ListNode first;
	
	public LinkedList()
	{
		length = 0;
		first = null;
	}
	
	public int length()
	{
		return length;
	}
	
	public ListNode firstNode()
	{
		return first;
	}

	public void addFirst(String name)
	{
		first = new ListNode(name, firstNode());		
		length++;
	}
	
	public void print()
	{
		ListNode n = firstNode();
		for(int i = 0; i < length(); i++)
		{
			System.out.println(n.getName());
			n = n.getLink();
		}
	}
	
	public void insert(String name, ListNode target)
	{
		if(target == null)
		{
			ListNode n = new ListNode(name, null);
			first = n;
		}
		else
		{		
			ListNode n = new ListNode(name,target.getLink());
			target.setLink(n);
		}
		
		length++;
		// �������ڷ� ���� target �ڿ� ���ο� ��带 �����ϴ� �޼ҵ�
		// ���ο� ��带 ���޹��� name�� �̿��ؼ� ����
	}
	
	public ListNode searchNode(String name)
	{
		ListNode n = firstNode();
		for(int i = 0; i < length(); i++)
		{
			if(n.getName().equals(name))
			{
				return n;
			}
			n = n.getLink();
		}
		
		return n;				
		// �������ڷ� ���� name�� ������ �ִ� Node�� ��ȯ�ϴ� �޼ҵ�		
	}
	
	public void insertFront(String name, ListNode target)
	{
		ListNode t = firstNode();
		
		for(int i = 0; i < length; i++)
		{
			if(target == firstNode())
			{
				ListNode n = new ListNode(name, target);
				first = n;
				length++;
				return;
			}
			
			if(target == t.getLink())
			{				
				ListNode n = new ListNode(name, target);
				
				t.setLink(n);
				length++;
				return;
			}
			t = t.getLink();
		}		
		// insertFront �޼ҵ�� target �տ� ���ο� ��� ����
	}	
}
