package ex;
/*
 * 조건문!!
 * if,switch-case
 * 조건문 if 
 * if(조건식){
 * 	조건식이 True일 때 실행할 문장;
 * }
 */
public class Day01_Ex04_condition {
	public static void main(String[] args) {
	if (true) {
		System.out.println("실행 o");
	}
	if (false) {
		System.out.println("실행 x");
	}
	// 문제 1) 양수, 0, 음수 출력
	int num1 = -10;
	if (num1 > 0) {
		System.out.println("양수");
	}
	if (num1 == 0) {
		System.out.println("0");
	}
	
	if (num1 < 0) {
		System.out.println("음수");
	}
	
	// 문제 2) 4의 배수 출력
	int num2 = 12;
	if (num2 %4 ==0) {
		System.out.println("4의 배수");
	}
	if (num2 %4 !=0) {
		System.out.println("4의 배수가 아님");
	}
	
	// 문제 3) 합격, 불합격 출력
	int score = 87;
	if (score >= 90) {
		System.out.println("합격");
	}
	if (score < 90) {
		System.out.println("불합격");
	}
	
	
	

	}
}
