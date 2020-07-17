package text02;
class Book{
	String title;
	String author;
	int price;
	
	void setData(String title,int price) {
		setData(title,"작자미상",price);
	}
	
	void setData(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title+":"+author+"("+price+"원)");
	}
}
public class Day25_03_constroctor01 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setData("자바의 정석", "남궁성", 27000);
		b1.showInfo();
		
		Book b2 = new Book();
		b2.setData("춘향전", 9000);
		b2.showInfo();
	}
}
