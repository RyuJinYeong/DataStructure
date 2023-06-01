package doublelist;

public class DNode {
	private String name;
	private DNode leftLink, rightLink;
	
	public DNode()
	{
		name = null;
		leftLink = null;
		rightLink = null;
	}
	
	public DNode(String name)
	{
		this.name = name;
		leftLink = null;
		rightLink = null;
	}
	
	public DNode(String name, DNode leftLink, DNode rightLink)
	{
		this.name = name;
		this.leftLink = leftLink;
		this.rightLink = rightLink;
	}
	
	public void setName(String name) {this.name = name; }
	
	public void setLeftLink(DNode leftLink) {this.leftLink = leftLink;}
	
	public void setRightLink(DNode rightLink) {this.rightLink = rightLink; }
	
	public String getName() { return name; }
	
	public DNode getLeftLink() { return leftLink; }
	
	public DNode getRightLink()	{ return rightLink; }
}
