package test;

class Book{
	String author;
	String title;
	
	// 단축키 : 생성자 자동완성
	// alt + shift + s, o
	
	Book(String title){
		author = "작자미상";
	}

	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}

	
}

public class Ex03 {
	public static void main(String[] args) {
		
		Book b1 = new Book("춘향뎐");
		System.out.println(b1.author);
		
	}
}
