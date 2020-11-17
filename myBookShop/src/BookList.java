import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {
	
	private ArrayList<BookVO> bookList = new ArrayList<BookVO>();

	public ArrayList<BookVO> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "==========================================================\n";
		str += "  도서명  저자  출판사  출판일  가격  \n";
		str += "==========================================================\n";
		int total = 0;
		for (BookVO vo : bookList) {
			str += vo + "\n";
			total += vo.getPrice();
		}
		str += "==========================================================\n";
		str += "                                      총 가격 : " + new DecimalFormat("#,##0").format(total) + "\n";
		str += "==========================================================\n";
		return str;
	}
	
	void addBook(BookVO vo) {
		this.bookList.add(vo);
	}

}
