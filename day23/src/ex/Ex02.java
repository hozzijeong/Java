package ex;

class Number{
	
	// 매개변수(parameter)
	int changeNum(int num) {
		num = 100;
		return num;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		int num = 10;
		
		Number n = new Number();
	
		System.out.println("메서드 호출 전 = " + num);
		
		// 인자,인수(argument)
		num = n.changeNum(num);
		
		System.out.println("메서드 호출 후 = " + num);
		
	}
}
