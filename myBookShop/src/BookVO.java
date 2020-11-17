import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookVO {
	
	String title;
	String author;
	String publisher;
	Date date;
	int price;
	
	public BookVO() {}
	public BookVO(String title, String author, String publisher, Date date, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		DecimalFormat df = new DecimalFormat("#,##0");
		
		return String.format("%s %s %s %s %s", this.title, this.author, this.publisher, sdf.format(date) , df.format(price));
	}
}
