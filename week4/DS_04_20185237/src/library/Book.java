package library;

public class Book {
	private String name;
	private String writer;
	private int ID;
	
	public Book(String name, String writer, int ID)
	{
		this.name = name;
		this.writer = writer;
		this.ID = ID;
	}
	
	public void print_info()
	{
		System.out.println("------------------------------------------------------");
		System.out.println("이름 : "+name +"\n작가 : "+writer+"\nID : "+ID);
		System.out.println("------------------------------------------------------");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}	
}
