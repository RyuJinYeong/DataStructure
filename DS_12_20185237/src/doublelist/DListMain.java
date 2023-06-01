package doublelist;

public class DListMain {
	public static void main(String[] args)
	{
		DList dl = new DList();
		dl.addFirst("3");
		dl.addFirst("2");
		dl.addFirst("1");
		dl.print();
		dl.insert(dl.search("3"), "3.5");
		dl.print();
		dl.delete(dl.search("2"));
		dl.print();
	}
}
