package ex;

class Ex04{
	void test1(int x) { x = 100;}
	
	int test2() {
		int x = 100;
		return x;
	}
}

public class Day23_Ex09_method03_land2 {
	public static void main(String[] args) {
		
		Ex04 e = new Ex04();
		
		int x = 7;
		System.out.println("x = " + x);
		
		e.test1(x);
		System.out.println("x = " + x);

	
		System.out.println();
		
		x = e.test2();
		System.out.println("x = " + x);
		
	
	}
}
