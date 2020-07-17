package bookshop;

import java.sql.Date;
public class BookShop {
	public static void main(String[] args) {
		BookList bookList = new BookList();
		BookVo book1 = new BookVo("자바", "홍길동", "코리아 출판사", new Date(2010,5,15),15000);
		BookVo book2 = new BookVo("자바", "홍동", "코리아 출판사", new Date(2010,5,15),15000);
		BookVo book3 = new BookVo("자바", "홍길", "코리아 출판사", new Date(2010,5,15),15000);
		BookVo book4 = new BookVo("자바", "길동", "코리아 출판사", new Date(2010,5,15),15000);
		BookVo book5 = new BookVo("자바", "홍", "코리아 출판사", new Date(2010,5,15),15000);
	
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		
		System.out.println(bookList);
	
	
	
	
	}
}
