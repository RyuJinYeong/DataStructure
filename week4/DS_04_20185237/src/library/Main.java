package library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		lib.add_book("해리포터 비밀의 방", "JK 롤링", 10110100);
		lib.add_book("다빈치코드", "댄 브라운", 10110011);
		lib.add_book("해리포터 죽음의 성물", "JK 롤링", 10110101);
		lib.add_book("어린 왕자", "생텍쥐페리", 10110010);
		
		/* 1번
		lib.find_book("어린 왕자").print_info();
		
		lib.find_book(10110101).print_info();
		
		lib.find_writer("JK 롤링").print_book();		
		*/
		
		/* 2번
		lib.sort_ID();
		lib.reverse_book_list();
		lib.print_book();
		*/
		
		/* 3번
		lib.changeBookName("어린 왕자", "어른 왕자");
		lib.changeBookID(10110011, 10000000);
		lib.changeBookWriter("JK 롤링", "롤링");
		lib.print_book();		 
		*/
	}
}
