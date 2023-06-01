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
}
