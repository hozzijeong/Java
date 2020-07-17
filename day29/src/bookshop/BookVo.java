package bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// å 1���� ������ ����ϴ� Ŭ����	
public class BookVo {
	private String title;
	private String author;
	private String publisher;
	private Date date;
	private double price;
		
	public BookVo() {}
	public BookVo(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
		// �������� �μ�(data)�� �Ѿ�� ��¥���� �⵵�� 1900�� ���� 1�� ���� �����Ŵ;
		date.setYear(date.getYear() - 1900);
		date.setMonth(date.getMonth() -1);
		
		this.date= date;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd(E)");
		
		DecimalFormat df = new DecimalFormat("#,##0��");
		
		return String.format("%s %s %s %s %s", title,author,publisher,sdf.format(date),df.format(price));
	}
	
}
