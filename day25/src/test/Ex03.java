package test;

class Book{
	String author;
	String title;
	
	// ����Ű : ������ �ڵ��ϼ�
	// alt + shift + s, o
	
	Book(String title){
		author = "���ڹ̻�";
	}

	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}

	
}

public class Ex03 {
	public static void main(String[] args) {
		
		Book b1 = new Book("���ⵯ");
		System.out.println(b1.author);
		
	}
}
