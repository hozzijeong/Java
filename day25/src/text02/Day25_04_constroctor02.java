package text02;
class Book2{
	String title;
	String author;
	int price;
	
	Book2(){}
	
	Book2(String title, int price){
		this(title,"���ڹ̻�",price);
	}
	
	Book2(String title,String author,int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title+":"+author+"("+price+"��)");
	}
}
public class Day25_04_constroctor02 {
	public static void main(String[] args) {
		Book2 b1 = new Book2("������ ����","���ü�",27000);
		b1.showInfo();
		
		Book2 b2 = new Book2("������", 9000);
		b2.showInfo();
	}
}
