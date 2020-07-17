package ex;

public class Day01_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10+3);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10%3);
		
		// 산술연산자 중에서 소수점까지 나타내고 싶으면
		// 정수와 실수 끼리 연산해야한다.
		System.out.println(10/3.0);
		
		// 덧셈연산자를 통한 활용
		// 문자 + 문자 = 문자 
		System.out.println("hello"+ "it's me");
		// 숫자 + 문자 = 문자 (반대도 똑같음)
		System.out.println("10"+3);
		
		//앞에서 말했듯이, 숫자 +문자 = 문자가 되기때문에
		// 1) "더하기 =" + 10+3 = "더하기 = 10"+3
		// 2) "더하기 = 10" + 3 = "더하기 = 10 + 3"
		// 3) "더하기 = 103"이 되버림.
		System.out.println("더하기 = "+ 10+3);
		//따라서 숫자끼리 먼저 계산을 하고 싶다 하면 ()를 이용
		System.out.println("더하기 = "+ (10+3));
	}

}
