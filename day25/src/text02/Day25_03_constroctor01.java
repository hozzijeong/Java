package text02;
class Book{
	String title;
	String author;
	int price;
	
	void setData(String title,int price) {
		setData(title,"���ڹ̻�",price);
	}
	
	void setData(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title+":"+author+"("+price+"��)");
	}
}
public class Day25_03_constroctor01 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setData("�ڹ��� ����", "���ü�", 27000);
		b1.showInfo();
		
		Book b2 = new Book();
		b2.setData("������", 9000);
		b2.showInfo();
	}
}
