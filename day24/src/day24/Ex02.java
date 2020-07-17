package day24;

class Card {
	// 공통점 : 크기(static)
	// 차이점 : 숫자, 문양(non-static)
	static int width = 100;
	static int height = 150;
	
	int number;
	String shape;
}

public class Ex02 {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.number = 7;
		c1.shape = "heart";
		
		c1.width = 150;
		c1.height = 100;
		
		Card c2 = new Card();
		c2.number = 4;
		c2.shape = "spade";
		
		System.out.println(c2.width);
		System.out.println(c2.height);
	}
}






