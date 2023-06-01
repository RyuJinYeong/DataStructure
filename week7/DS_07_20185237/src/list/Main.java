package list;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearList linear = new LinearList();
		
		System.out.println(linear.isEmpty());
		
		linear.insert("A");
		linear.insert("B");
		linear.insert("C");
		linear.insert("D");
		linear.replace(0, "E");
		linear.replace("C", "F");
		
		System.out.println(linear.isEmpty());
		
		linear.printArray();
	}

}
