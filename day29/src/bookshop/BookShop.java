package bookshop;

import java.sql.Date;
public class BookShop {
	public static void main(String[] args) {
		BookList bookList = new BookList();
		BookVo book1 = new BookVo("�ڹ�", "ȫ�浿", "�ڸ��� ���ǻ�", new Date(2010,5,15),15000);
		BookVo book2 = new BookVo("�ڹ�", "ȫ��", "�ڸ��� ���ǻ�", new Date(2010,5,15),15000);
		BookVo book3 = new BookVo("�ڹ�", "ȫ��", "�ڸ��� ���ǻ�", new Date(2010,5,15),15000);
		BookVo book4 = new BookVo("�ڹ�", "�浿", "�ڸ��� ���ǻ�", new Date(2010,5,15),15000);
		BookVo book5 = new BookVo("�ڹ�", "ȫ", "�ڸ��� ���ǻ�", new Date(2010,5,15),15000);
	
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		
		System.out.println(bookList);
	
	
	
	
	}
}
