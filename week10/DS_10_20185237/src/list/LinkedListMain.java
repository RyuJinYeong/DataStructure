package list;

public class LinkedListMain {
	public static void main(String[] args)
	{
		LinkedList list1 = new LinkedList();
		list1.insert("Moon", null);
		list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.addFirst("Joo");
		list1.insertFront("Park", list1.searchNode("Joo"));
		list1.insertFront("Lee", list1.searchNode("Joo"));
		list1.insertFront("Jeon", list1.searchNode("Moon"));
		list1.print();
	}
}
