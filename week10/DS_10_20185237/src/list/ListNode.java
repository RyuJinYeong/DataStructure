package list;

public class ListNode {
	private String name;
	private ListNode link;
	
	public ListNode()
	{
		link = null;
	}
	
	public ListNode(String name)
	{
		this.name = name;
		link = null;
	}
	
	public ListNode(String name, ListNode link)
	{
		this.name = name;
		this.link = link;
	}
	
	public void setname(String name) { this.name = name; }
	
	public void setLink(ListNode link) { this.link = link; }
	
	public String getName() { return name; }
	
	public ListNode getLink() { return link; }
}
