package ex;

class Num{
	
	int x;
	
	void setNum(int x) {
		// System.out.println("this = " + this);
		this.x = x;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		Num n = new Num();
		System.out.println("n = " + n);
		
		n.setNum(100);
		
		Num a = new Num();
		System.out.println("a = " + a);
		a.setNum(100);
		
		System.out.println(n.x);
	}
}
