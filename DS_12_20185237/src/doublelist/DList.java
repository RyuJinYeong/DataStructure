package doublelist;

public class DList {
	DNode first;
	public DList() {
		first = null;
	}
	
	public void addFirst(String name) 
	{		
		if(first==null)
		{
			DNode temp = new DNode(name);
			first = temp;
			return;
		}
		DNode temp = new DNode(name,first.getLeftLink(),first);		
		first.setLeftLink(temp);		
		first = temp;
	}
	
	public void delete(DNode target) 
	{
		DNode a = target.getLeftLink();
		DNode b = target.getRightLink();
		a.setRightLink(b);
		b.setLeftLink(a);
	}
	
	public void insert(DNode target, String name)
	{
		if(target.getRightLink() == null)
		{			
			DNode n = new DNode(name);
			target.setRightLink(n);
			n.setLeftLink(target);
			return;
		}
		
		DNode temp = target.getRightLink();
		
		DNode n = new DNode(name,target,temp);
		temp.setLeftLink(n);
	}
	
	public DNode search(String name)
	{		
		DNode t = first;
		
		while(true)
		{
			if(t.getName().equals(name))
			{
				return t;
			}
			t = t.getRightLink();			
		}
	}
	
	public void print()
	{
		DNode target = first;
		while(target!= null)
		{
			if(target.getRightLink() == null)
			{
				System.out.println(target.getName());
				break;
			}
			System.out.print(target.getName()+", ");
			target = target.getRightLink();
		}
	}
}
