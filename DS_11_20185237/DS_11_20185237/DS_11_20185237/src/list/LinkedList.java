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
	
	public void invert()
	{
		// �ش� ����Ʈ�� �������� ������ �޼ҵ�
		
		ListNode a = first;
		ListNode b = a.getLink();
		ListNode t = b.getLink();
		
		ListNode l = first;
		
		for(int i = 0; i < length(); i++)
		{						
			if(length == 1)
			{				
				break;
			}
			else if(l != null)
			{				
				if(l.getLink() == null)
				{					
					break;
				}

				l = l.getLink();
			}						
		}
		
		for(int i = 0; i < length(); i++)
		{
			if(b != null)
			{
				if(a == first)
				{
					a.setLink(null);
				}
				
				b.setLink(a);	
				
				if(b == l)
				{
					first = b;
					break;
				}
				
				a = b;
				b = t;
				
				if(b != null)
				{
					t = b.getLink();
				}
			}
		}
	}
	
	public void delete(ListNode p)
	{
		// ���޹��� ListNode p ���� ��带 �����ϴ� �޼ҵ�
		
		if(p.getLink() == null)
		{
			return;
		}
		
		ListNode t = first;
		
		for(int i = 0; i<length(); i++)
		{
			if(t == p)
			{
				t.setLink(t.getLink().getLink());
				break;
			}
			
			if(t != null)
			{
				t = t.getLink();
			}
		}				
		length--;
	}
	
	public static LinkedList concatList(LinkedList list1, LinkedList list2)
	{
		// ���޹��� �� ����Ʈ�� �����Ͽ� �����ϴ� �޼ҵ�
		ListNode a = list1.firstNode();
				
		for(int i = 0; i < list1.length(); i++)
		{
			if(a.getLink() == null)
			{				
				a.setLink(list2.first);
				list1.length += list2.length;
				break;
			}
						
			a = a.getLink();			
		}		
		
		return list1;
	}
	
	public void deleteLastNode()
	{
		// �ش� ����Ʈ�� ������ ��带 �����ϴ� �޼ҵ�
		ListNode a = first;
				
		for(int i = 0; i < length(); i++)
		{						
			if(length == 1)
			{				
				first = null;
			}
			else if(a != null)
			{				
				if(a.getLink().getLink() == null)
				{					
					a.setLink(null);
					length--;
					break;
				}

				a = a.getLink();
			}						
		}
	}
	
	
}
