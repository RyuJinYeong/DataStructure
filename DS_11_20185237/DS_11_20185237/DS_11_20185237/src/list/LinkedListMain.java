package list;

public class LinkedListMain {
	public static void main(String[] args)
	{
		LinkedList list1 = new LinkedList();
		list1.insert("Moon", null);
		list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.addFirst("Joo");
		list1.deleteLastNode();
		
		LinkedList list2 = new LinkedList();
		list2.insert("1", null);
		list2.addFirst("2");
		list2.addFirst("3");
		list2.addFirst("4");
		
		LinkedList.concatList(list1, list2).print();
		
		LinkedList list3 = new LinkedList();
		list3.insert("a", null);
		list3.addFirst("b");
		list3.addFirst("c");
		list3.addFirst("d");
		
		list3.print();
		list3.delete(list3.searchNode("c"));
	}
}
