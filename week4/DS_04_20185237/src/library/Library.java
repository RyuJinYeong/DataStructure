package library;


public class Library {
	public static final int BOOK_DEFAULT_MAX = 10;
	public static final int ARRAY_INCREASE_RATE = 2;
	
	private Book[] book_list;
	private int num_of_book;
	
	public Library()
	{
		book_list = new Book[BOOK_DEFAULT_MAX];
		num_of_book = 0;
	}

	public void add_book(String name, String writer, int ID)
	{
		if(book_list[num_of_book] == null)
		{			
			book_list[num_of_book] = new Book(name,writer,ID);
			num_of_book++;
		}
		else
		{
			book_list = newBookList(book_list);
			book_list[num_of_book] = new Book(name,writer,ID);
			num_of_book++;
		}
	}
	
	public void add_book(Book newBook)
	{
		if(book_list[num_of_book] == null)
		{
			book_list[num_of_book] = newBook;
			num_of_book++;
		}
		else
		{
			book_list = newBookList(book_list);
			book_list[num_of_book] = newBook;
			num_of_book++;
		}
	}
	
	public void print_book()
	{
		for(int i = 0; i<num_of_book; i++)
		{
			book_list[i].print_info();
		}		
	}
	
	private Book[] newBookList(Book[] old_book_list)
	{
		Book[] new_book_list = new Book[num_of_book + ARRAY_INCREASE_RATE];
		for(int i = 0; i<num_of_book + ARRAY_INCREASE_RATE; i++)
			new_book_list[i] = old_book_list[i];
		return new_book_list;
	}
	
	public Book find_book(String name)
	{
		int i = 0;
		System.out.println("Book Name : "+name);
		for(i = 0; i<num_of_book; i++)
		{
			if(book_list[i].getName().equals(name))
			{
				return book_list[i];
			}
		}		
		
		return null;
	}
	
	public Book find_book(int ID)
	{
		int i = 0;
		System.out.println("Book ID : "+ID);
		for(i = 0; i<num_of_book; i++)
		{
			if(book_list[i].getID() == ID)
			{
				return book_list[i];
			}
		}		
		
		return null;		
	}
	
	public Library find_writer(String writer)
	{
		Library temp = new Library();
		System.out.println("Book Writer : "+writer);
		for(int i = 0; i<num_of_book; i++)
		{
			if(book_list[i].getWriter().equals(writer))
			{
				temp.add_book(book_list[i]);
			}
		}		
				
		return temp;
	}
	
	public void sort_ID()
	{
		Book t = new Book("","",0);
				
		for(int i = 0; i<num_of_book; i++)
		{ 
			for(int j = i+1; j<num_of_book; j++)
			{
				if(book_list[i].getID() > book_list[j].getID())
				{
					t = book_list[i];
					book_list[i] = book_list[j];
					book_list[j] = t;
				}
			}
		}
	}
	
	public void reverse_book_list()
	{
		Book[] temp = new Book[num_of_book];
		int j=0;
		for(int i = num_of_book-1; i>=0; i--)
		{ 
			temp[j] = book_list[i];
			j++;
		}
		
		for(int i = 0; i<num_of_book; i++)
		{ 
			book_list[i] = temp[i];
		}
	}
	
	public void changeBookName(String oldName, String newName)
	{
		find_book(oldName).setName(newName);
	}
	
	public void changeBookID(int oldID, int newID)
	{
		find_book(oldID).setID(newID);
	}
	
	public void changeBookWriter(String oldWiter, String newWriter)
	{
		Library temp = new Library();
		temp = find_writer(oldWiter);
		for(int i = 0; i < temp.num_of_book; i++)
		{
			temp.book_list[i].setWriter(newWriter);
		}
	}
}
