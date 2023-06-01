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
		// 전달인자로 받은 target 뒤에 새로운 노드를 삽입하는 메소드
		// 새로운 노드를 전달받은 name을 이용해서 생성
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
		// 전달인자로 받은 name을 가지고 있는 Node를 반환하는 메소드		
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
		// insertFront 메소드는 target 앞에 새로운 노드 삽입
	}
	
	public void invert()
	{
		// 해당 리스트를 역순으로 뒤집는 메소드
		
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
		// 전달받은 ListNode p 뒤의 노드를 삭제하는 메소드
		
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
		// 전달받은 두 리스트를 연결하여 리턴하는 메소드
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
		// 해당 리스트의 마지막 노드를 삭제하는 메소드
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
