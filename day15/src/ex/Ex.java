package ex;

public class Ex {
	public static void main(String[] args) {
		
		// 예외(Exception) 처리
		// java.lang.ArithmeticException: / by zero
		// System.out.println(10 / 0);

		int x = 10;
		int y = 0;
		
		if(y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println(x / y);
		}
		
		//-----------------------------------------------------
		
		try {
			// 에러가 발생할 여지가 있는 코드
			System.out.println(x / y);
		}catch(ArithmeticException e) {
			// 에러가 발생했을 때 보여줄 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e) {
			System.out.println("모든 에러를 처리해줍니다.");
		}
		
	}
}
