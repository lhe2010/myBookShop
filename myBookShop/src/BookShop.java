// 2020-11-17 화 3교시 17:10-17:14 uml
// 2020-11-17 화 3교시 17:14-17:30 1차완성
import java.util.Date;

public class BookShop {

	public static void main(String[] args) {
		
		BookList bookList = new BookList();
		
		BookVO vo1 = new BookVO("자바잡기1", "홍길동", "컴퓨터나라", new Date(), 17000);
		BookVO vo2 = new BookVO("자바잡기2", "홍길동", "컴퓨터나라", new Date(), 17000);
		BookVO vo3 = new BookVO("자바잡기3", "홍길동", "컴퓨터나라", new Date(), 17000);
		BookVO vo4 = new BookVO("자바잡기4", "홍길동", "컴퓨터나라", new Date(), 17000);
		BookVO vo5 = new BookVO("자바잡기5", "홍길동", "컴퓨터나라", new Date(), 17000);
		BookVO vo6 = new BookVO("자바잡기6", "홍길동", "컴퓨터나라", new Date(), 17000);
		
		bookList.addBook(vo1);
		bookList.addBook(vo2);
		bookList.addBook(vo3);
		bookList.addBook(vo4);
		bookList.addBook(vo5);
		bookList.addBook(vo6);
		
		BookVO book1 = new BookVO("자바1", "홍길동", "코리아출판사", new Date(), 18000);
		BookVO book2 = new BookVO("자바2", "홍길자", "코리아출판사", new Date(), 17000);
		BookVO book3 = new BookVO("자바3", "홍길숙", "코리아출판사", new Date(), 21000);
		BookVO book4 = new BookVO("자바4", "홍길희", "코리아출판사", new Date(), 35000);
		BookVO book5 = new BookVO("자바5", "홍길영", "코리아출판사", new Date(), 12000);
		BookVO book6 = new BookVO("자바6", "홍길도", "코리아출판사", new Date(), 15000);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		System.out.println(bookList);
	}
}
